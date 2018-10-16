package baekjoon;

import java.io.*;

/***
 Problem Number : 1568
 Problem Link : https://www.acmicpc.net/problem/1568
 ***/
public class _1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int count = 0;
        int number = 1;
        int index = n;

        for(int i=0; i<index; i++) {
            if(n < number)
                number = 1;
            n -= number;
            number++;
            count++;
            if(n == 0)
                break;
        }

        System.out.println(count);
    }
}
