package baekjoon;

// Problem URL : https://www.acmicpc.net/problem/3273
// Problem Name : 두 수의 합

import java.io.*;
import java.util.StringTokenizer;

public class _3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] flag = new int[2000001];
        int answer = 0;

        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
        int x = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++) {
            int e = Integer.parseInt(tokenizer.nextToken());

            if (e > x) {
                continue;
            }

            int c = x - e;
            if (flag[c] > 0) {
                answer++;
            } else {
                flag[e]++;
            }
        }

        out.write(answer + "\n");
        out.flush();
        out.close();
    }
}
