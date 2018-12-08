package baekjoon;

import java.io.*;

/***
 Problem Name : 문자열 분석
 Problem Number : 10820
 Problem Link : https://www.acmicpc.net/problem/10820
 ***/
public class _10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while((input = in.readLine()) != null && input.length() != 0) {
            int lower = 0;
            int upper = 0;
            int num = 0;
            int blank = 0;

            for(int i=0; i<input.length(); i++) {
                if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z' )
                    lower++;
                else if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                    upper++;
                else if(input.charAt(i) >= '0' && input.charAt(i) <= '9')
                    num++;
                else
                    blank++;
            }

            out.write(lower + " " + upper + " " + num + " " + blank + "\n");
            out.flush();
        }
        out.close();
    }
}
