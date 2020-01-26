package baekjoon;

import java.io.*;

/***
 Problem Name : 나는 친구가 적다.
 Problem Number : 16171
 Problem Link : https://www.acmicpc.net/problem/16171
 ***/
public class _16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String k = in.readLine();

        s = s.replaceAll("[0-9]","");

        if(s.contains(k))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
