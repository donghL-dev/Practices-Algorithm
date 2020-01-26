package baekjoon;

import java.io.*;

public class _14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        for(int i=0; i<str.length(); i++) {
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                continue;
            else
                System.exit(0);
        }

        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::" + str  +"::fan:");
        System.out.println(":fan::fan::fan:");
    }
}
