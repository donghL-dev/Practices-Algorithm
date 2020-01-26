package baekjoon;

import java.io.*;

/***
 Problem Name : 네 수
 Problem Number : 10824
 Problem Link : https://www.acmicpc.net/problem/10824
 ***/
public class _10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        String[] input_arr = input.split(" ");

        long ab = Long.valueOf(input_arr[0] + input_arr[1]);
        long cd = Long.valueOf(input_arr[2] + input_arr[3]);

        out.write(String.valueOf(ab + cd));
        out.flush();
        out.close();
    }
}
