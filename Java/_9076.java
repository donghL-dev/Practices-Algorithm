package baekjoon;

import java.io.*;

/***
 Problem Number : 9076
 Problem Link : https://www.acmicpc.net/problem/9076
***/

public class _9076 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        if(t < 1 || t > 10)
            System.exit(0);

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] strarr = str.split(" ");
            int[] score = new int[5];
            int max = 0;
            int min = 11;
            int maxindex = 0;
            int minindex = 0;
            int result = 0;

            score[0] = Integer.valueOf(strarr[0]);
            score[1] = Integer.valueOf(strarr[1]);
            score[2] = Integer.valueOf(strarr[2]);
            score[3] = Integer.valueOf(strarr[3]);
            score[4] = Integer.valueOf(strarr[4]);


            for(int j=0; j<score.length; j++) {

                if(max <= score[j]) {
                    max = score[j];
                    maxindex = j;
                }

                if(min > score[j]) {
                    min = score[j];
                    minindex = j;
                }

            }

            score[maxindex] = 0;
            score[minindex] = 0;

            int max2 = 0;
            int min2 = 11;
            for (int c=0; c<5; c++)
            {
                if (score[c] >= max2)
                    max2 = score[c];
                if (score[c] < min2 && score[c]!=0)
                    min2 = score[c];
                result += score[c];
            }

            if(max2 - min2 >= 4)
                System.out.println("KIN");
            else {
                System.out.println(result);
            }

        }
    }
}
