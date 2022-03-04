package baekjoon;

import java.io.*;

// Problem URL : https://www.acmicpc.net/problem/2443
// Problem Name : 별 찍기 - 6

public class _2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i=n; i>0; i--) {
            for (int j=0; j<((2*n)/2)+i-1; j++) {
                out.write(j >= ((2*n)/2)-i ? "*" : " ");
            }
            out.write("\n");
        }

        out.flush();
        out.close();
    }
}
