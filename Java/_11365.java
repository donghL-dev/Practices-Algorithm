package baekjoon;

import java.io.*;

/***
 Problem Name : !밀비 급일
 Problem Number : 11365
 Problem Link : https://www.acmicpc.net/problem/11365
 ***/

public class _11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String str = in.readLine();

            if(str.equals("END"))
                break;

            for(int i=str.length()-1; i>=0; i--)
                out.write(str.charAt(i));

            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
