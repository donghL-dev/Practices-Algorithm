package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/***
 Problem Name : 문자열 반복
 Problem Number : 2675
 Problem Link : https://www.acmicpc.net/problem/2675
 ***/

public class _2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.valueOf(in.readLine());

        StringCycle(t, in, out);
    }

    public static void StringCycle(int t, BufferedReader in,BufferedWriter out) throws IOException {
        for(int i=0; i<t; i++) {
            StringTokenizer token = new StringTokenizer(in.readLine());
            int r = Integer.valueOf(token.nextToken());
            String s = token.nextToken();

            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<r; k++)
                    out.write(s.charAt(j) + "");
            }

            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
