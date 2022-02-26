package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// Problem URL : https://www.acmicpc.net/problem/2446
// Problem Name : 별 찍기 - 9

public class _2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(token.nextToken());

        for (int i=0; i<2*n-1; i++) {
            for (int j=0; j<2*n-1; j++) {
                if (i <= (2*n-1) / 2) {
                    if (j < i ) {
                        out.write(" ");
                    } else if (j > 2*n-2-i) {
                        out.write("");
                    } else {
                        out.write("*");
                    }
                } else {
                    if (j < 2*n-2-i) {
                        out.write(" ");
                    } else if (j > i) {
                        out.write("");
                    } else {
                        out.write("*");
                    }
                }
            }
            out.write("\n");
        }


        out.flush();
        out.close();
    }
}
