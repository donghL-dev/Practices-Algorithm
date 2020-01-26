package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 평균
 Problem Number : 1546
 Problem Link : https://www.acmicpc.net/problem/1546
 ***/
public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());
        double[] arr = new double[n];
        double max = 0;
        double sum = 0;
        StringTokenizer token = new StringTokenizer(in.readLine());

        for(int i=0; i<n; i++) {
            arr[i] = Double.valueOf(token.nextToken());
            if(max < arr[i])
                max = arr[i];
        }

        for(int i=0; i<n; i++) {
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }

        out.write(sum/n + "\n");
        out.flush();
        out.close();
    }
}
