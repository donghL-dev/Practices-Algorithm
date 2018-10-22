package baekjoon;

import java.io.*;

/***
 Problem Number : 1731
 Problem Link : https://www.acmicpc.net/problem/1731
 ***/
public class _1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        if(n < 3 || n > 50)
            System.exit(0);

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.valueOf(in.readLine());
            if(arr[i] > 10000000)
                System.exit(0);
        }

        if((arr[1] - arr[0] == arr[2] - arr[1]))
            System.out.print(arr[n-1] + (arr[1] - arr[0]));
        else
            System.out.print(arr[n-1] * (arr[1] / arr[0]));
    }
}
