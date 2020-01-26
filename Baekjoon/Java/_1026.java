package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 보물
 Problem Number : 1026
 Problem Link : https://www.acmicpc.net/problem/1026
 ***/
public class _1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int result = 0;

        String str1 = in.readLine();
        String str2 = in.readLine();
        String[] strarr = str1.split(" ");
        String[] strarr2 = str2.split(" ");

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++) {
            arr1[i] = Integer.valueOf(strarr[i]);
            arr2[i] = Integer.valueOf(strarr2[i]);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<n; i++)
            result += arr1[i] * arr2[n-1-i];

        System.out.println(result);
    }
}
