package baekjoon;

import java.io.*;

public class _5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        for(int i=0; i<n; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            long r = Integer.valueOf(str2[0]);
            long e = Integer.valueOf(str2[1]);
            long c = Integer.valueOf(str2[2]);
            if((e-c) > r)
                System.out.println("advertise");
            else if((e-c) == r)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
        }
    }
}
