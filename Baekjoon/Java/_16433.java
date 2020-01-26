package baekjoon;

import java.io.*;

/***
 Problem Name : 주디와 당근농장
 Problem Number : 16433
 Problem Link : https://www.acmicpc.net/problem/16433
 ***/
public class _16433 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        String[] str = input.split(" ");

        int n = Integer.valueOf(str[0]);
        int r = Integer.valueOf(str[1]);
        int c = Integer.valueOf(str[2]);

        int count = 1;

        if(n%2 == 0) {
            for(int i=0; i<n; i++) {
                count++;
                for(int j=0; j<n; j++) {
                    if(r%2 != 0 && c%2 != 0) { // r 홏수 c 홀수
                        if(count % 2 != 0)
                            out.write(".");
                        else
                            out.write("v");
                        count++;
                    }
                    else if(r%2 != 0 && c%2 == 0) {
                        if(count % 2 != 0)
                            out.write("v");
                        else
                            out.write(".");
                        count++;
                    }
                    else if(r%2 == 0 && c%2 != 0) {
                        if(count % 2 != 0)
                            out.write("v");
                        else
                            out.write(".");
                        count++;
                    }
                    else if(r%2 == 0 && c%2 == 0) {
                        if(count % 2 != 0)
                            out.write(".");
                        else
                            out.write("v");
                        count++;
                    }
                }
                out.write("\n");
            }
        }
        else {
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(r % 2 != 0 && c % 2 == 0) {
                        if(count % 2 == 0)
                            out.write("v");
                        else
                            out.write(".");
                        count++;
                    }
                    else if(r % 2 != 0 && c % 2 != 0) {
                        if(count % 2 == 0)
                            out.write(".");
                        else
                            out.write("v");
                        count++;
                    }
                    else if(r % 2 == 0 && c % 2 != 0) {
                        if(count % 2 == 0)
                            out.write("v");
                        else
                            out.write(".");
                        count++;
                    }
                    else if(r % 2 == 0 && c % 2 == 0) {
                        if(count % 2 == 0)
                            out.write(".");
                        else
                            out.write("v");
                        count++;
                    }
                }
                out.write("\n");
            }
        }

        out.flush();
        out.close();
    }
}
