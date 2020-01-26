package baekjoon;

import java.io.*;

/***
 Problem Name : Grading Exams
 Problem Nmber : 9296
 Problem Link : https://www.acmicpc.net/problem/9296
 ***/
public class _9296 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            int l = Integer.valueOf(in.readLine());
            int count = 0;
            String str = in.readLine();
            String str2 = in.readLine();

            for(int j=0; j<l; j++) {
                if (str.charAt(j) != str2.charAt(j))
                    count++;
            }

            System.out.println("Case " + (i+1) + ": " + count);
        }
    }
}
