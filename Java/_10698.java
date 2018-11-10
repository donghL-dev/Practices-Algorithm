package baekjoon;

import java.io.*;

/***
 Problem Name : Ahmed Aly
 Problem Number : 10698
 Problem Link : https://www.acmicpc.net/problem/10698
 ***/

public class _10698 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(in.readLine());
        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int x = Integer.valueOf(str2[0]);
            int y = Integer.valueOf(str2[2]);
            int z = Integer.valueOf(str2[4]);

            if(str2[1].equals("+")) {
                if (x + y == z)
                    System.out.println("Case " + (i+1) + ": YES");
                else
                    System.out.println("Case " + (i+1) + ": NO");
            }

            else if(str2[1].equals("-")) {
                if (x - y == z)
                    System.out.println("Case " + (i+1) + ": YES");
                else
                    System.out.println("Case " + (i+1) + ": NO");
            }
        }
    }
}
