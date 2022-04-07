package baekjoon;

import java.io.*;
import java.util.Arrays;

// Problem URL : https://www.acmicpc.net/problem/1919
// Problem Name : 애너그램 만들기

public class _1919{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26];

        String first = in.readLine();
        String second = in.readLine();

        for (int i=0; i<first.length(); i++) {
            char c = first.charAt(i);
            arr[c - 97]++;
        }

        for (int i=0; i<second.length(); i++) {
            char c = second.charAt(i);
            arr[c - 97]--;
        }

        out.write(Arrays.stream(arr).filter(i -> i != 0).map(Math::abs).sum() + "\n");
        out.flush();
        out.close();
    }
}
