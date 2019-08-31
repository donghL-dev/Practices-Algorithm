package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : ATM
 Problem Number : 11399
 Problem Link : https://www.acmicpc.net/problem/11399
 ***/
public class _11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());
        String[] times = in.readLine().split(" ");
        int[] numbers = new int[n];

        for(int i=0; i<n; i++)
            numbers[i] = Integer.valueOf(times[i]);

        Arrays.sort(numbers);

        int sum = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++)
                sum += numbers[j];
        }

        out.write(sum + "\n");
        out.flush();
        out.close();
    }
}
