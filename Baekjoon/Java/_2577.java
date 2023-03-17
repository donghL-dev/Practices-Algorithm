package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2577
// Problem Name : 숫자의 개수

public class _2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        char[] charArr = String.valueOf(a * b * c).toCharArray();

        for (char ch : charArr) {
            String str = String.valueOf(ch);
            arr[Integer.parseInt(str)]++;
        }

        for (int n : arr){
            out.write(n + "\n");
        }

        out.flush();
        out.close();
    }
}
