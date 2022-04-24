package baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// Problem URL : https://www.acmicpc.net/problem/1406
// Problem Name : 에디터

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String initStr = in.readLine();
        int commandCount = Integer.parseInt(in.readLine());
        List<Character> editor = new LinkedList<>();
        ListIterator<Character> cursor = editor.listIterator();
        for (int i=0; i<initStr.length(); i++) {
            cursor.add(initStr.charAt(i));
        }

        for (int i=0; i<commandCount; i++) {
            edit(in.readLine(), cursor);
        }

        out.write(editor.stream().map(String::valueOf).collect(Collectors.joining("")) + "\n");
        out.flush();
        out.close();
    }

    private static void edit(String input, ListIterator<Character> cursor) {
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        String command = tokenizer.nextToken();
        switch (command) {
            case "L":
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
                break;
            case "D":
                if (cursor.hasNext()) {
                    cursor.next();
                }
                break;
            case "B":
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
                break;
            case "P":
                cursor.add(tokenizer.nextToken().charAt(0));
                break;
        }
    }
}
