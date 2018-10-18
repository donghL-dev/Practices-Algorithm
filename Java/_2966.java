package baekjoon;

import java.io.*;

/***
 Problem Number : 2966
 Problem Link : https://www.acmicpc.net/problem/2966
 ***/
public class _2966 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        String result = in.readLine();
        String[] str = result.split("");

        String Adrian = "ABCABC";
        String Bruno = "BABC";
        String Goran = "CCAABB";
        int[] count = new int[3];
        int j = 0;
        int k = 0;

        for(int i=0; i<n; i++) {
            if(str[i].equals(String.valueOf(Adrian.charAt(j)))) {
                count[0]++;
            }
            if(str[i].equals(String.valueOf(Bruno.charAt(k)))) {
                count[1]++;
            }
            if(str[i].equals(String.valueOf(Goran.charAt(j)))) {
                count[2]++;
            }
            k++;
            j++;
            if(k == 4)
                k = 0;
            if(j == 6)
                j = 0;
        }

        if(count[0] > count[1] && count[0] > count[2]) {
            System.out.println(count[0]);
            System.out.println("Adrian");
        }

        else if(count[1] > count[0] && count[1] > count[2]) {
            System.out.println(count[1]);
            System.out.println("Bruno");
        }

        else if(count[2] > count[0] && count[2] > count[1]) {
            System.out.println(count[2]);
            System.out.println("Goran");
        }

        else if(count[0] > count[1] && count[0] == count[2]) {
            System.out.println(count[0]);
            System.out.println("Adrian");
            System.out.println("Goran");
        }

        else if(count[0] == count[1] && count[0] > count[2]) {
            System.out.println(count[0]);
            System.out.println("Adrian");
            System.out.println("Bruno");
        }

        else if(count[1] == count[2] && count[1] > count[0]) {
            System.out.println(count[1]);
            System.out.println("Bruno");
            System.out.println("Goran");
        }
        else if(count[1] == count[2] && count[1] == count[0]) {
            System.out.println(count[0]);
            System.out.println("Adrian");
            System.out.println("Bruno");
            System.out.println("Goran");
        }
    }
}
