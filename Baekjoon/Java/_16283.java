package baekjoon;

import java.io.*;

/***
 Problem Name : Farm
 Problem Number : 16283
 Problem Link : https://www.acmicpc.net/problem/16283
 ***/
public class _16283 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String str2[] = str.split(" ");

        int a = Integer.valueOf(str2[0]);
        int b = Integer.valueOf(str2[1]);
        int n = Integer.valueOf(str2[2]);
        int w = Integer.valueOf(str2[3]);

        int x = 0;
        int y = 0;
        int count = 0;
        for(int i=1; i<n; i++) {
            if((a*i) + (b*(n-i)) == w) {
                count++;
                x = i;
                y = n-i;
            }
        }

        if(count == 1)
            System.out.println(x + " " + y);
        else
            System.out.println(-1);
    }
}
