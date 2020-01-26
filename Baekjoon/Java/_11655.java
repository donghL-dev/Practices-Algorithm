package baekjoon;

import java.io.*;

/***
 Problem Name : ROT13
 Problem Number : 11655
 Problem Link : https://www.acmicpc.net/problem/11655
 ***/
public class _11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        String output = "";

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'z') {
                if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    char c = (char) (input.charAt(i) + 13);
                    if(c > 'Z') {
                        c = (char) ('A' + (c - 'Z' - 1));
                    }
                    output += String.valueOf(c);
                }
                else {
                    char c = (char) (input.charAt(i) + 13);
                    if(c > 'z') {
                        c = (char) ('a' + (c - 'z' - 1));
                    }
                    output += String.valueOf(c);
                }
            }
            else
                output += String.valueOf(input.charAt(i));
        }

        out.write(output);
        out.flush();
        out.close();
    }
}
