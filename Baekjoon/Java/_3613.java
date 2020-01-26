package baekjoon;

import java.io.*;

/***
 Problem Name : Java vs C++
 Problem Number : 3613
 Problem Link : https://www.acmicpc.net/problem/3613
 ***/
public class _3613 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();

        if(input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
            out.write("Error!");
            out.flush();
            System.exit(0);
        }
        else if(input.charAt(0) == '_' || input.charAt(input.length()-1) == '_') {
            out.write("Error!");
            out.flush();
            System.exit(0);
        }
        else if(input.contains("_")) {
            for(int i=1; i<input.length(); i++) {
                if (input.charAt(i) == '_' && input.charAt(i - 1) == '_') {
                    out.write("Error!");
                    out.flush();
                    System.exit(0);
                }
            }

            for(int i=0; i<input.length(); i++) {
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    out.write("Error!");
                    out.flush();
                    System.exit(0);
                }
            }
        }


        String temp = "";

        if(input.contains("_")) {
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '_')
                    temp += String.valueOf((char)(input.charAt(++i) - 32));
                else
                    temp += input.charAt(i);
            }
        }
        else {
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    temp += "_";
                    temp += String.valueOf((char)(input.charAt(i) + 32));
                }
                else
                    temp += input.charAt(i);
            }
        }

        out.write(temp + "\n");
        out.flush();
        out.close();
    }
}
