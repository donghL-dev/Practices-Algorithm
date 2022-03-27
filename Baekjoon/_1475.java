package baekjoon;

import java.io.*;
import java.util.Arrays;

// Problem URL : https://www.acmicpc.net/problem/1475
// Problem Name : 방 번호

public class _1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        char[] chars = in.readLine().toCharArray();
        int sixOrNineCount = 0;

        for (char c : chars) {
            int n = Integer.parseInt(String.valueOf(c));
            if (n == 6 || n == 9) {
                sixOrNineCount++;
            } else {
                arr[n]++;
            }
        }

        sixOrNineCount = sixOrNineCount % 2 == 0 ? sixOrNineCount / 2 : (sixOrNineCount / 2) + 1;
        int max = Arrays.stream(arr).max().getAsInt();

        out.write(Math.max(sixOrNineCount, max) + "\n");
        out.flush();
        out.close();
    }
}
