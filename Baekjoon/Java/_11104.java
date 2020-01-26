package baekjoon;

import java.io.*;

/***
 Problem Name : Fridge of Your Dreams
 Problem Number : 11104
 Problem Link : https://www.acmicpc.net/problem/11104
 ***/
public class _11104 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            int x = Integer.valueOf(str, 2);
            System.out.println(x);
        }
    }
}
