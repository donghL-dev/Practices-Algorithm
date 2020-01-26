package baekjoon;

import java.io.*;

/***
 Problem Number : 11586
 Problem Link : https://www.acmicpc.net/problem/11586
 ***/
public class _11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(in.readLine());
        String arr[][] = new String[n][n];
        
        for(int i=0; i<n; i++) {
            String str = in.readLine();
            for(int j=0; j<n; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        int k = Integer.valueOf(in.readLine());

        if(k == 1) {
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(arr[i][j]);
                System.out.println();
            }
        }
        else if(k == 2) {
            for(int i=0; i<n; i++) {
                for (int j=n-1; j>=0; j--)
                    System.out.print(arr[i][j]);
                System.out.println();
            }
        }
        else {
            for(int i=n-1; i>=0; i--) {
                for (int j=0; j<n; j++)
                    System.out.print(arr[i][j]);
                System.out.println();
            }
        }

    }
}
