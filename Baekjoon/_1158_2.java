package baekjoon;

import java.io.*;
import java.util.*;

// Problem URL : https://www.acmicpc.net/problem/1158
// Problem Name : 요세푸스 문제

public class _1158_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer =  new StringTokenizer(in.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        List<Integer> result = solve(n, k);

        for (int i=0; i<n; i++) {
            if (result.size() == 1) {
                out.write("<" + result.get(i) + ">");
                break;
            }
            if (i == 0) {
                out.write("<" + result.get(i) + ", ");
            } else if (i == n-1) {
                out.write(result.get(i) + ">");
            } else {
                out.write(result.get(i) + ", ");
            }
        }

        out.flush();
        out.close();
    }
    private static List<Integer> solve(int n, int k) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> table = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            table.add(i);
        }

        while (!table.isEmpty()) {
            for (int i=0; i<k-1; i++) {
                int e = table.removeFirst();
                table.addLast(e);
            }
            result.add(table.removeFirst());
        }

        return result;
    }
}
