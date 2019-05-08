package baekjoon;

import java.io.*;

/***
 Problem Name : 중앙 이동 알고리즘
 Problem Number : 2903
 Problem Link : https://www.acmicpc.net/problem/2903
 ***/
public class _2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());
        int answer = 0;
        int count = 2;
        int z = 1;

        for(int i=0; i<n; i++) {
            count += z;
            answer = count*count;
            z *= 2;
        }

        out.write(answer + "\n");
        out.flush();
        out.close();
    }
}
