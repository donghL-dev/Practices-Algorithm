package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// Problem URL : https://www.acmicpc.net/problem/1267
// Problem Name : 핸드폰 요금

public class _1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(in.readLine());
        int[] seconds = new int[count];
        StringTokenizer token = new StringTokenizer(in.readLine());

        for (int i=0; i<count; i++) {
            seconds[i] = Integer.parseInt(token.nextToken());
        }

        int y = 0;
        int m = 0;

        for (int second : seconds) {
            y += (second + 1) % 30 == 0 ? (second / 30) * 10 : ((second / 30) + 1) * 10;
            m += (second + 1) % 60 == 0 ? (second / 60) * 15 : ((second / 60) + 1) * 15;
        }

        if (y == m) {
            out.write("Y M " + y);
        } else {
            out.write(y > m ? "M " + m : "Y " + y);
        }

        out.write("\n");
        out.flush();
        out.close();
    }
}
