package baekjoon;

import java.io.*;

/***
 Problem Number : 15857
 Problem Name : 백준 온라인 저지
 Problem Link : https://www.acmicpc.net/problem/15857
 ***/
public class _15857 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int pn = Integer.valueOf(in.readLine());

        if(pn == 1)
            System.out.println("a");
        else if(pn == 2 || pn == 3)
            System.out.println("b");
        else if(pn == 4 || pn == 8)
            System.out.println("c");
        else if(pn == 5 || pn == 6 || pn == 7)
            System.out.println("d");

    }

}
