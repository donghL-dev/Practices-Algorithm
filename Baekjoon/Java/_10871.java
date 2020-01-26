package baekjoon;

import java.io.*;

public class _10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int n = Integer.valueOf(str2[0]);
        int x = Integer.valueOf(str2[1]);

        if(n < 1 || n > 10000 || x < 1 || x > 10000)
            System.exit(0);

        String str3 = in.readLine();
        str2 = str3.split(" ");

        for(int i=0; i<str2.length; i++) {
            int a = Integer.valueOf(str2[i]);
            if(a < 1 || a > 10000)
                System.exit(0);

            if(a < x)
                System.out.print(a + " ");
        }

    }
}
