package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// Problem URL : https://www.acmicpc.net/problem/10804
// Problem Name : 카드 역배치

public class _10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String[] ranges = new String[10];

        for (int i=0; i<10; i++) {
            ranges[i] = in.readLine();
        }

        for (String range : ranges) {
            StringTokenizer tokenizer = new StringTokenizer(range);
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());
            swap(start - 1, end - 1, numbers);
        }

        out.write(Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
        out.write("\n");

        out.flush();
        out.close();
    }

    private static void swap(int start, int end, int[] numbers) {
        for (int i=0; i<((end - start) / 2) + 1; i++) {
            int temp = numbers[start + i];
            numbers[start + i] = numbers[end - i];
            numbers[end - i] = temp;
        }
    }
}
