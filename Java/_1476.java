package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 날짜계산
 Problem Number : 1476
 Problem Link : https://www.acmicpc.net/problem/1476
 ***/
public class _1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(in.readLine());

        int e = Integer.valueOf(token.nextToken());
        int s = Integer.valueOf(token.nextToken());
        int m = Integer.valueOf(token.nextToken());
        int count = 1;
        int e1 = 1, s1 = 1, m1 = 1;

        while(e != e1 || s != s1 || m != m1) {
            e1++;
            s1++;
            m1++;
            count++;

            if(e1 > 15)
                e1 = 1;
            if(s1 > 28)
                s1 = 1;
            if(m1 > 19)
                m1 = 1;
        }

        out.write(count + "\n");
        out.flush();
        out.close();
    }
}
