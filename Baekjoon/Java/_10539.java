package baekjoon;

import java.io.*;

/***
 Problem Number : 10539
 Problem Link : https://www.acmicpc.net/problem/10539
 ***/

public class _10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int[] arr = new int[n];
        String str = in.readLine();
        String[] str2 = str.split(" ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.valueOf(str2[i]);
        }

        int sum = 0;

        for(int j=0; j<arr.length; j++) {
            if(j == 0)
                arr[j] = arr[j];
            else {
                sum += arr[j-1];
                arr[j] = (arr[j] * (j + 1))-sum;
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
