package baekjoon;

import java.io.*;

/***
 Problem Name : basket reverse
 Problem Number : 10811
 Problem Link : https://www.acmicpc.net/problem/10811
 ***/
public class _10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int n = Integer.valueOf(str2[0]);
        int m = Integer.valueOf(str2[1]);
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = i+1;

        for(int k=0; k<m; k++) {
            str = in.readLine();
            str2 = str.split(" ");
            int i = Integer.valueOf(str2[0]);
            int j = Integer.valueOf(str2[1]);

            swap(arr, i, j);
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    private static void swap(int n[], int i, int j) {
        if(j < i) return;
        int temp = n[i-1];
        n[i-1] = n[j-1];
        n[j-1] = temp;
        swap(n, i+1, j-1);
    }
}
