package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Problem URL : https://www.acmicpc.net/problem/2587
// Problem Name : 대표값 2

public class _2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> input = new ArrayList<>();
        for (int i=0; i<5; i++) {
            input.add(Integer.parseInt(in.readLine()));
        }

        out.write(input.stream().reduce(0, Integer::sum) / input.size() + "\n");
        out.write(input.stream().sorted().collect(Collectors.toList()).get(input.size() / 2) + "\n");

        out.flush();
        out.close();
    }
}
