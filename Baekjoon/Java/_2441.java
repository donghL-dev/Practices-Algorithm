package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2441
// Problem Name : 별 찍기 - 4

public class _2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                out.write(j >= i ? "*" : " ");
            }
            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
