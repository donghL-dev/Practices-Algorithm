package baekjoon;

import java.io.*;

/***
 Problem Name : advanced math
 Problem Number : 7510
 Problem Link : https://www.acmicpc.net/problem/7510
 */
public class _7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        for(int i=0; i<n; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            int x = Integer.valueOf(str2[0]);
            int y = Integer.valueOf(str2[1]);
            int z = Integer.valueOf(str2[2]);

            System.out.println("Scenario #" + (i+1) + ":");
            if(x > y && x > z) {
                if((y*y) + (z*z) == (x*x))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else if(y > x && y > z) {
                if((x*x) + (z*z) == (y*y))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else {
                if((x*x) + (y*y) == (z*z))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            System.out.println();
        }
    }
}
