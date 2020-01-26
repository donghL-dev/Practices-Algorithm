package baekjoon;

import java.io.*;

public class _1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int x = Integer.valueOf(str2[0]);
        int y = Integer.valueOf(str2[1]);

        if(x < -10000 || x > 10000 || y < -10000 || y > 10000)
            System.exit(0);

        if(x > y)
            System.out.println(">");
        else if(x < y)
            System.out.println("<");
        else
            System.out.println("==");
    }
}
