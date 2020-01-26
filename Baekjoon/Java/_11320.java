package baekjoon;

import java.io.*;

public class _11320 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        if(t < 0 || t > 100)
            System.exit(0);

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int a = Integer.valueOf(str2[0]);
            int b = Integer.valueOf(str2[1]);
            int c = a/b;

            if(b > a || b < 1 || b > 1000 || a < 1 || a > 1000)
                System.exit(0);

            if(c == 1)
                System.out.println(1);
            else
                System.out.println(c*c);
        }
    }
}
