package baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// Problem URL : https://www.acmicpc.net/problem/5397
// Problem Name : 키로거

public class _5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        for (int i=0; i<n; i++) {
            String input = in.readLine();
            List<Character> passwords = new LinkedList<>();
            ListIterator<Character> cursor = passwords.listIterator();

            for (char c : input.toCharArray()) {
                switch (c) {
                    case '<':
                        if (cursor.hasPrevious()) {
                            cursor.previous();
                        }
                        break;
                    case '>':
                        if (cursor.hasNext()) {
                            cursor.next();
                        }
                        break;
                    case '-':
                        if (cursor.hasPrevious()) {
                            cursor.previous();
                            cursor.remove();
                        }
                        break;
                    default:
                        cursor.add(c);
                }
            }

            out.write(passwords.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(""))
                    + "\n");
        }

        out.flush();
        out.close();
    }
}
