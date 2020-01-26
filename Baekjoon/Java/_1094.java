package baekjoon;

import java.io.*;

/***
 Problem Number : 1094
 Problem Link : https://www.acmicpc.net/problem/1094
 ***/

public class _1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.valueOf(in.readLine());

        if(x > 64 || x < 1)
            System.exit(0);

        int length = 64;
        int count = 0;

        while (x > 0) {

            if (length > x) {
                length /= 2;
            } else {
                count++;
                x -= length;
            }
        }
        System.out.println(count);
    }
}
