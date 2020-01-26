package baekjoon;

import java.io.*;

/***
 Problem Name : Von Neumann
 Problem Number : 9469
 Problem Link : https://www.acmicpc.net/problem/9469
 ***/
public class _9469 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            int index = Integer.valueOf(str2[0]);
            double d = Double.valueOf(str2[1]); //  철로의 길이
            double a = Double.valueOf(str2[2]); // 기차 A의 속도
            double b = Double.valueOf(str2[3]); // 기차 B의 속도
            double f = Double.valueOf(str2[4]); // 파리의 속도

            double result = (d/(a+b))*f;

            System.out.printf("%d %.2f\n", index, result);
        }
    }
}
