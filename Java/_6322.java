package baekjoon;

import java.io.*;

/***
 Problem Number : 6322
 Problem Link : https://www.acmicpc.net/problem/6322
 ***/
public class _6322 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        int count = 1;
        while (loop) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            double a = Double.valueOf(str2[0]);
            double b = Double.valueOf(str2[1]);
            double c = Double.valueOf(str2[2]);

            if(a == 0 && b == 0 && c == c)
                break;

            System.out.println("Triangle #" + count);

            if(a == -1) {
                if(b >= c) {
                    System.out.println("Impossible.");
                    System.out.println();
                }
                else {
                    System.out.printf("a = %.3f\n", Math.sqrt(c*c - b*b));
                    System.out.println();
                }
            }
            else if(b == -1) {
                if(a >= c) {
                    System.out.println("Impossible.");
                    System.out.println();
                }
                else {
                    System.out.printf("b = %.3f\n", Math.sqrt(c*c - a*a));
                    System.out.println();
                }

            }
            else {
                System.out.printf("c = %.3f\n", Math.sqrt(a*a + b*b));
                System.out.println();
            }
            count++;
        }
    }
}
