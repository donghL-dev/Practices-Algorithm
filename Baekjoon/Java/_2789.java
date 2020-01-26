package baekjoon;

import java.io.*;

public class _2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        String[] str2 = str.split("");

        if(str.length() < 3 || str.length() > 100 )
            System.exit(0);

        for(int i=0; i<str2.length; i++) {
            if(str2[i].equals("A") || str2[i].equals("B") || str2[i].equals("C") || str2[i].equals("D") || str2[i].equals("E") || str2[i].equals("G")  || str2[i].equals("I") ||
                    str2[i].equals("M") || str2[i].equals("R") ) {
                str2[i] = "";
            }

        }
        for(int i=0; i<str2.length; i++)
        System.out.print(str2[i]);
    }
}
