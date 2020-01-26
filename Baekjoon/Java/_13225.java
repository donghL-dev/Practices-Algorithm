package baekjoon;

import java.io.*;

/***
 Problem Name : Divisors
 Problem Number : 13225
 Problem Link : https://www.acmicpc.net/problem/13225
 ***/
public class _13225 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine());
            int count = 0;
            System.out.println(n + " " + divisors(n, 1, count));
        }
    }
    private static int divisors(int n, int j, int count) {
        if(j > n) return count;
        if((n % j) == 0)
                count++;
        return divisors(n, j+1, count);
    }
}
