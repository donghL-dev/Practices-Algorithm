package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2444
// Problem Name : 별 찍기 - 7


public class _2444 {
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

        for (int i=n-1; i>0; i--) {
            for (int j=0; j<((2*n)/2)+i-1; j++) {
                out.write(j >= ((2*n)/2)-i ? "*" : " ");
            }
            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
