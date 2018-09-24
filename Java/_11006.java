package baekjoon;

import java.io.*;

public class _11006 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        if(t > 25 || t < 1)
            System.exit(0);

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int n = Integer.valueOf(str2[0]); // 다리의 합.
            int m = Integer.valueOf(str2[1]); // 닭의 수.
            int count = m*2;

            if(n > 300 || t < 1)
                System.exit(0);


            if(count == n)
                System.out.println(0 + " " + m);
            else {
                int x = n-m;
                int y = m-x;
                System.out.println(y + " " + x);
            }
        }
    }
}
