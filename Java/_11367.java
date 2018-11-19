package baekjoon;

import java.io.*;

/***
 Problem Name : Report Card Time
 Problem Number : 11367
 Problem Link : https://www.acmicpc.net/problem/11367
 ***/
public class _11367 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int score = Integer.valueOf(str2[1]);

            if(score >= 97 && score <= 100)
                System.out.println(str2[0] + " " + "A+");
            else if(score >= 90 && score <= 96)
                System.out.println(str2[0] + " " + "A");
            else if(score >= 87 && score <= 89)
                System.out.println(str2[0] + " " + "B+");
            else if(score >= 80 && score <= 86)
                System.out.println(str2[0] + " " + "B");
            else if(score >= 77 && score <= 79)
                System.out.println(str2[0] + " " + "C+");
            else if(score >= 70 && score <= 76)
                System.out.println(str2[0] + " " + "C");
            else if(score >= 67 && score <= 69)
                System.out.println(str2[0] + " " + "D+");
            else if(score >= 60 && score <= 66)
                System.out.println(str2[0] + " " + "D");
            else
                System.out.println(str2[0] + " " + "F");
        }
    }
}
