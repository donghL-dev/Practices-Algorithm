package baekjoon;

import java.io.*;

public class _8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int count = 0;

        for(int i=0; i<=n; i++) {
            count += i;
        }

        System.out.println(count);
    }
}
