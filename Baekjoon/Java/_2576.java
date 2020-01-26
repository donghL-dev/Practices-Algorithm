package baekjoon;

import java.io.*;

public class _2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;

        for(int i=0; i<7; i++) {
            String str = in.readLine();
            int c = Integer.valueOf(str);
            if( c > 100)
                System.exit(0);
            if(c != 0 && c%2 == 1) {
                a += c;
                if(b == 0 || c < b)
                    b = c;
            }
        }
        if(a == 0 && b == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(a);
            System.out.println(b);
        }

    }
}
