package baekjoon;

import java.io.*;

public class _4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        if(n < 1 || n > 1000)
            System.exit(0);

        while(true) {
            int x = Integer.valueOf(in.readLine());

            if(x < 1 || x > 10000)
                break;

            if(x%n == 0)
                System.out.println(x + " " + "is a multiple of " + n + ".");
            else
                System.out.println(x + " " + "is NOT a multiple of " + n + ".");
        }
    }
}
