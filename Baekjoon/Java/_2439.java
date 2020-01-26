package baekjoon;

import java.io.*;

/***
 Problem Name : 별 찍기 - 2
 Problem Number : 2349
 Problem Link : https://www.acmicpc.net/problem/2349
 ***/
public class _2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());

        for(int i=1; i<=n; i++) {
            for(int z=0; z<n-i; z++)
                out.write(" ");
            for(int j=n; j>n-i; j--)
                out.write("*");
            out.write("\n");
            out.flush();
        }

        out.close();
    }
}
