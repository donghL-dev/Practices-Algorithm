package baekjoon;

import java.io.*;

/***
 Problem Name : 럭비 클럽
 Problem Number : 2083
 Problem Link : https://www.acmicpc.net/problem/2083
 */
public class _2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = in.readLine();
            String[] str = input.split(" ");

            String name = str[0];
            int age = Integer.valueOf(str[1]);
            int weight = Integer.valueOf(str[2]);

            if(name.equals("#"))
                break;

            if(age > 17 || weight >= 80)
                out.write(name + " " + "Senior\n");
            else
                out.write(name + " " + "Junior\n");
            out.flush();
        }
        out.close();
    }
}
