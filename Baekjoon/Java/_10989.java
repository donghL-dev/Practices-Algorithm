package baekjoon;

import java.io.*;

/***
 Problem Name : Integer Sorting 3
 Problem Number : 10989
 Problem Link : https://www.acmicpc.net/problem/10989
 ***/
public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(in.readLine());
        int count[]=new int[10000+1];

        for(int i=0; i<n; i++) {
            count[Integer.valueOf(in.readLine())]++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] != 0)
                while(count[i] > 0) {
                    out.write(String.valueOf(i));
                    out.newLine();
                    count[i]--;
                }
        }
        out.flush();
        out.close();
    }
}
