package baekjoon;

import java.io.*;

public class _4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        String[] strarr = new String[n];

        for(int i=0; i<n; i++) {
            String str = in.readLine();
            if(str.length() > 30)
                System.exit(0);
            if(str.charAt(0) < 'A' || str.charAt(0) > 'z')
                System.exit(0);
            if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
                char ch =(char) (str.charAt(0) - ('a' - 'A'));
                String st = String.valueOf(ch);
                str = st + str.substring(1, str.length());
            }

            strarr[i] = str;
        }

        for(int i=0; i<strarr.length; i++) {
            System.out.println(strarr[i]);
        }
    }
}
