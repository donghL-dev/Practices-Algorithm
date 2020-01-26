package baekjoon.IO;

import java.io.*;
public class BufferedReader {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader in = new java.io.BufferedReader(new InputStreamReader(System.in));

        String srt = in.readLine();

        String[] srt2 = srt.split("");

        for(int i = 0; i<srt2.length; i++) {
            System.out.println(srt2[i]);
        }

    }
}
