package baekjoon;

import java.io.*;

/***
 Problem Name : 설탕배달
 Problem Number : 2839
 Problem Link : https://www.acmicpc.net/problem/2839
 ***/
public class _2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());

        if(n == 4 || n == 7)
            out.write(-1 +"\n");
        else if(n%5 == 0)
            out.write(n/5 + "\n");
        else if(n%5%2 == 1)
            out.write(n/5+1 + "\n");
        else
            out.write(n/5+2 + "\n");

        out.flush();
        out.close();
    }
}
