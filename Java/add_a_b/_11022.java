package baekjoon.add_a_b;

import java.io.*;

public class _11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        int[] num = new int[t];
        int[] ab = new int[t];
        int[] ba = new int[t];

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int a = Integer.valueOf(str2[0]);
            ab[i] = a;
            int b = Integer.valueOf(str2[1]);
            ba[i] = b;
            num[i] = a + b;
        }

        for(int i=0; i<t; i++) {
            System.out.println("Case #" + (i+1) + ": " + ab[i] + " + " + ba[i] + " = " + num[i] );
        }
    }
}
