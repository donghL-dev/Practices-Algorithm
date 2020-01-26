package baekjoon;

import java.io.*;

/***
 Problem Name : 1로 만들기
 Problem Number : 1463
 Problem Link : https://www.acmicpc.net/problem/1463
 ***/

public class _1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());
        int dp[] = new int[n+1];

        dp[0] = dp[1] = 0;

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 3 == 0) dp[i] = Math.min(dp[i/3]+1, dp[i]);
            if(i % 2 == 0) dp[i] = Math.min(dp[i/2]+1, dp[i]);
        }

        out.write(dp[n] + "\n");
        out.flush();
        out.close();
    }
}
