package baekjoon;

import java.io.*;

/***
 Problem Name : Sum of Odd Sequence
 Problem Number : 9713
 Problem Link : https://www.acmicpc.net/problem/9713
 ***/
public class _9713 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine());
            int sum = 0;
            for(int j=1; j<=n; j++)
                sum += j%2 != 0 ? j : 0;
            System.out.println(sum);
        }
    }
}
