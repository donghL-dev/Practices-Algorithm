package baekjoon;

import java.io.*;

/***
 Problem Number : 4447
 Problem Link : https://www.acmicpc.net/problem/4447
 ***/
public class _4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        if(n < 1)
            System.exit(0);

        for(int i=0; i<n; i++) {
            String str = in.readLine();
            int b = 0;
            int g = 0;

            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == 'b' || str.charAt(j) == 'B')
                    b++;
                else if(str.charAt(j) == 'g' || str.charAt(j) == 'G')
                    g++;
            }
            str += " is ";
            if(g > b)
                System.out.println(str + "GOOD");
            else if(g < b)
                System.out.println(str + "A BADDY");
            else
                System.out.println(str + "NEUTRAL");
        }
    }
}
