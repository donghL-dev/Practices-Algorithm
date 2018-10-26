package baekjoon;

import java.io.*;

/***
 Problem Number : 2386
 Problem Link : https://www.acmicpc.net/problem/2386
 */
public class _2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            if(str.equals("#"))
                break;

            int count = 0;
            for(int i=1; i<str2.length; i++) {
                for(int j=0; j<str2[i].length(); j++) {
                    if (str2[0].charAt(0) == str2[i].charAt(j) || (str2[0].charAt(0) - ('a' - 'A')) == str2[i].charAt(j))
                        count++;
                }
            }

            System.out.print(str2[0] + " " + count);
            System.out.println();
        }
    }
}
