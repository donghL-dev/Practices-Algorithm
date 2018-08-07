package baekjoon;

import java.io.*;

public class _1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine().trim();

        if(str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(str.split(" ").length);
        }
    }
}
