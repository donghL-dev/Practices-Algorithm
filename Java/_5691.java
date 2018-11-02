package baekjoon;

import java.io.*;

/***
 Problem Name : Average median problem
 Problem Number : 5691
 Problem Link : https://www.acmicpc.net/problem/5691
 */
public class _5691 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            int a = Integer.valueOf(str2[0]);
            int b = Integer.valueOf(str2[1]);

            if(a == 0 && b == 0)
                break;

            if(a > b)
                System.out.println(b-(a-b));
            else
                System.out.println(a-(b-a));
        }
    }
}
