package baekjoon;

import java.io.*;

public class _2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int n = Integer.valueOf(str);

        if(n < 2 || n > 1000)
            System.exit(0);

        int[] player = new int[n];
        int count = 0;


        for(int i=0; i<player.length; i++) {
            String str2 = in.readLine();
            String[] str3 = str2.split(" ");

            int a = Integer.valueOf(str3[0]);
            int b = Integer.valueOf(str3[1]);
            int c = Integer.valueOf(str3[2]);

            if(a == b && b == c) {
                count = 10000 + (a*1000);
                player[i] = count;
            }

            if(a == b && a != c) {
               count = 1000 + (a * 100);
               player[i] = count;
            }
            if(b == c && b != a) {
                count = 1000 + (b * 100);
                player[i] = count;
            }
            if(c == a && b != c) {
                count = 1000 + (a * 100);
                player[i] = count;
            }

            if(a != b && b != c ) {
                if(a > b && a > c)
                    count = a * 100;
                else if ( b > a && b > c)
                    count = b * 100;
                else if ( c > b && c > a)
                    count = c * 100;
                player[i] = count;
            }
        }

        int max = player[0];
        for(int i=1; i<player.length; i++) {
            if(player[i] >= max)
                max = player[i];
        }

        System.out.println(max);
    }
}
