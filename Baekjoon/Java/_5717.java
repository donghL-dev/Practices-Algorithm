package baekjoon;

import java.io.*;

public class _5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int m = Integer.valueOf(str2[0]);
            int f = Integer.valueOf(str2[1]);

            if(m == 0 && f == 0)
                System.exit(0);

            if((m >= 1 && m <= 5) || (m >= 1 && m <= 5)) {
                System.out.println(m+f);
            }
        }
    }
}
