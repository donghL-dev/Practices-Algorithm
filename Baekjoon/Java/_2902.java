package com.donghun.baekjoon;

import java.io.*;

/***
 Problem Name : KMP는 왜 KMP일까?
 Problem Number : 2902
 Problem Link : https://www.acmicpc.net/problem/2902
 ***/
public class _2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();

        KMPAlgorithm(input, out);
    }
    public static void KMPAlgorithm(String input, BufferedWriter out) throws IOException {
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                out.write(input.charAt(i) + "");
        }
        out.flush();
        out.close();
    }
}
