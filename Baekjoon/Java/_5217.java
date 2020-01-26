package baekjoon;

import java.io.*;

/***
 Problem Name : 쌍의 합
 Problem Number : 5217
 Problem Link : https://www.acmicpc.net/problem/5217
 ***/
public class _5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine());
            String[] str = new String[n/2];

            for(int j=0; j<n/2; j++) {
                if(j+1 + n-1-j == n && j+1 != n-1-j)
                    str[j] = String.valueOf(j+1) + " " + String.valueOf(n-1-j);
                else
                    str[j] = "";
            }

            System.out.print("Pairs for " + n + ": ");
            for(int k=0; k<str.length; k++) {
                if(!str[k].equals(""))
                    System.out.print(str[k] + (k != str.length-1 && !str[k+1].equals("") ? ", " : ""));
            }
            System.out.println();
        }
    }
}
