package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// Problem URL : https://www.acmicpc.net/problem/2753
// Problem Name : 윤년

public class _2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(in.readLine());
        int year = Integer.parseInt(token.nextToken());

        if (year % 4 != 0) {
            out.write("0" + "\n");
        } else if (year % 100 != 0 || year % 400 == 0){
            out.write("1" + "\n");
        } else {
            out.write("0" + "\n");
        }

        out.flush();
        out.close();
    }
}
