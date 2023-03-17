package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2442
// Problem Name : 별 찍기 - 5

public class _2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++) {
            for (int j=0; j<((2*n)/2)+i; j++) {
                out.write(j >= ((2*n)/2)-i-1 ? "*" : " ");
            }
            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
