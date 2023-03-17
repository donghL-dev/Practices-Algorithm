package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// Problem URL : https://www.acmicpc.net/problem/11328
// Problem Name : Strfry

public class _11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
            String first = tokenizer.nextToken();
            String second = tokenizer.nextToken();
            out.write(strfry(first, second) + "\n");
        }

        out.flush();
        out.close();
    }

    private static String strfry(String first, String second) {
        String sortedFirst = first.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining(""));
        String sortedSecond = second.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining(""));
        return sortedFirst.equals(sortedSecond) ? "Possible" : "Impossible";
    }
}
