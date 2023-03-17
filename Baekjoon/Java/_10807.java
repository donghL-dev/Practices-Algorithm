package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// Problem URL : https://www.acmicpc.net/problem/10807
// Problem Name : 개수 세기

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
        int v = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++) {
            int x = Integer.parseInt(tokenizer.nextToken());
            if (x == v) {
                answer++;
            }
        }

        out.write(answer + "\n");
        out.flush();
        out.close();
    }
}
