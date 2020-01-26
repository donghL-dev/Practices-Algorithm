package baekjoon;

import java.io.*;

/***
 Problem Name : 암호코드
 Problem Number : 2011
 Problem Link : https://www.acmicpc.net/problem/2011
 ***/
public class _2011 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        int[] dp = new int[input.length()+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=input.length(); i++) {
            int current = i-1;
            if(input.charAt(current) > '0')
                dp[i] = dp[i-1];

            int su = (input.charAt(current-1) - '0') * 10 + (input.charAt(current) - '0');

            if(su >= 10 && su <= 26)
                dp[i] = (dp[i] + dp[current-1]) % 1000000;
        }

        if(input.equals("0"))
            out.write("0\n");
        else
            out.write(dp[input.length()] + "\n");

        out.flush();
        out.close();
    }
}
