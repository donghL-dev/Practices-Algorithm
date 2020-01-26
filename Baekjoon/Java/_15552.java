package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/***
 Problem Name : 빠른 A + B
 Problem Number : 15552
 Problem Link : https://www.acmicpc.net/problem/15552
 ***/
public class _15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer token = new StringTokenizer(in.readLine());
            int a = Integer.valueOf(token.nextToken());
            int b = Integer.valueOf(token.nextToken());
            out.write(a+b + "\n");
        }

        out.flush();
        out.close();
    }
}
