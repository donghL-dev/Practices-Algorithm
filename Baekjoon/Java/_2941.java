package baekjoon;

import java.io.*;

/***
 Problem Name : 크로아티아 알파벳
 Problem Number : 2941
 Problem Link : https://www.acmicpc.net/problem/2941
 ***/
public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = in.readLine();

        for(int i=0; i<croatia.length; i++) {
            if(input.contains(croatia[i])) {
                input = input.replace(croatia[i], "x");
            }
        }

        out.write( input.length() + "\n");
        out.flush();
        out.close();
    }
}
