package baekjoon;

import java.io.*;

/***
 Problem Name : 알파벳 갯수
 Problem Number : 10808
 Problem Link : https://www.acmicpc.net/problem/10808
 ***/
public class _10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alphabet = new int[26];

        String input = in.readLine();

        for(int i=0; i<input.length(); i++)
            alphabet[input.charAt(i) - 97]++;

        for(int i=0; i<alphabet.length; i++)
            out.write(alphabet[i] + " ");

        out.write("\n");
        out.flush();
        out.close();
    }
}
