package baekjoon;

import java.io.*;

/***
 Problem Number : 15963
 Problem Link : https://www.acmicpc.net/problem/15963
 ***/

public class _15963 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        if(str2[0].equals(str2[1]))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
