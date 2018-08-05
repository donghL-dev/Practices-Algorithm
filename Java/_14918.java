package baekjoon;

import java.io.*;

public class _14918 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int a = Integer.valueOf(str2[0]);
        int b = Integer.valueOf(str2[1]);

        System.out.println(a + b);
    }
}
