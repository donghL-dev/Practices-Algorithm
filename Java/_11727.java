package baekjoon;

import java.io.*;

/***
 Problem Name : 2×n 타일링 2
 Problem Number : 11727
 Problem Link : https://www.acmicpc.net/problem/11727
 ***/
public class _11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine().trim());

        out.write(fibonacci(n) + "\n");
        out.flush();
        out.close();
    }
    private static int fibonacci(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 3;
        else {
            int[] result = new int[1001];
            result[0] = 1;
            result[1] = 3;
            for (int i = 2; i <n; i++) {
                result[i] = result[i - 1] + 2 * result[i - 2];
                result[i] %= 10007;
            }
            int answer = result[n-1];
            return answer;
        }
    }
}
