package baekjoon;

import java.io.*;

/***
 Problem Name : Hotdog
 Problem Number : 5666
 Priblem Link : https://www.acmicpc.net/problem/5666
 ***/
public class _5666 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = in.readLine();

            if(str == null || str.equals(""))
                break;

            String[] str2 = str.split(" ");

            double h = Integer.valueOf(str2[0]);
            double p = Integer.valueOf(str2[1]);

            System.out.printf("%.2f\n", h/p);
        }
    }
}
