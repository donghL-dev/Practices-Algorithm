package baekjoon;

import java.io.*;

/***
 Problem Number : 4470
 Problem Link : https://www.acmicpc.net/problem/4470
 ***/

public class _4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        String[] str = new String[t];

        for(int i=0; i<t; i++) {
            str[i] = in.readLine();
            if(str[i].length() > 50)
                System.exit(0);
        }

        for(int j=0; j<t; j++) {
            System.out.println(j+1 + ". " + str[j]);
        }
    }
}
