package baekjoon;

import java.io.*;

/***
 Problem Name : fibonacci number
 Problem Number : 2747
 Problem Link : https://www.acmicpc.net/problem/2747
 ***/

public class _2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(in.readLine());

        n = fibonacci(n);

        out.write(String.valueOf(n));

        out.flush();
        out.close();
    }
    private static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return  1;
        else {
            int[] result = new int[n+1];
            result[0] = 0;
            result[1] = 1;
            for (int i = 2; i < result.length; i++)
                result[i] = result[i - 1] + result[i - 2];
            int answer = result[result.length-1];
            return answer;
        }
    }
}
