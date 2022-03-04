package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2445
// Problem Name : 별 찍기 - 8

public class _2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i=0; i<2*n/2; i++) {
            int endIndex = (2 * n) - i - 1;
            for (int j=0; j<2*n; j++) {
                if (j > i && j < endIndex) {
                    out.write(" ");
                } else {
                    out.write("*");
                }
            }
            out.write("\n");
        }

        for (int i=2*n/2-2; i>=0; i--) {
            int endIndex = (2 * n) - i - 1;
            for (int j=0; j<2*n; j++) {
                if (j > i && j < endIndex) {
                    out.write(" ");
                } else {
                    out.write("*");
                }
            }
            out.write("\n");
        }


        out.flush();
        out.close();
    }
}
