package baekjoon;

import java.io.*;

/***
 Problem Name : 오늘도 패배했다.
 Problem Number : 14582
 Problem Link : https://www.acmicpc.net/problem/14582
 ***/
public class _14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int[] arr1 = new int[str2.length];
        int[] arr2 = new int[str2.length];

        for(int i=0; i<str2.length; i++)
            arr1[i] = Integer.valueOf(str2[i]);

        str = in.readLine();
        str2 = str.split(" ");

        for(int i=0; i<str2.length; i++)
            arr2[i] = Integer.valueOf(str2[i]);

        int winner = 0;
        int looser = 0;
        boolean answer = false;
        for(int i=0; i<arr1.length; i++) {
            winner += arr1[i];
            if(winner > looser) answer = true;
            looser += arr2[i];
        }

        if(answer)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
