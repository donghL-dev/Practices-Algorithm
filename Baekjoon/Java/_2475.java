package baekjoon;

import java.io.*;

public class _2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int b = 0;
        int[] num = new int[5];

        for(int i=0; i<num.length; i++) {
            num[i] = Integer.valueOf(str2[i]);
        }

        for(int i=0; i<num.length; i++) {
            int a = num[i];
            a *= a;
            b += a;
        }

        System.out.println(b%10);

    }
}
