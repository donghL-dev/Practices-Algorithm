package baekjoon;

import java.io.*;

/***
 Problem Name : Fibonacci Function
 Problem Number : 1003
 Problem Link : https://www.acmicpc.net/problem/1003
 ***/
public class _1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine());
            String result = fibonacci(n-1) + " " + fibonacci(n);
            System.out.println(result);
        }
    }
    private static int fibonacci(int n) {
        int before=0, cur=1, temp;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 1; i < n; i++){
                temp = cur;
                cur = before + cur;
                before = temp;
            }
            return cur;
        }
    }
}
