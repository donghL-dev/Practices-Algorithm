package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2440
// Problem Name : 별 찍기 - 3

public class _2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++) {
            for (int j=n-i; j>0; j--) {
                out.write("*");
            }
            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
