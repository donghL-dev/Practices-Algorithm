package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/***
 Problem Name : 동전 0
 Problem Number : 11047
 Problem Link : https://www.acmicpc.net/problem/11047
 ***/
public class _11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(in.readLine());
        int n = Integer.valueOf(token.nextToken());
        int k = Integer.valueOf(token.nextToken());

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = Integer.valueOf(in.readLine());

        int count = 0;

        while(k != 0) {
            int index = 0;
            int min = k;

            for(int i=0; i<arr.length; i++) {
                if(k - arr[i] < min && k - arr[i] >= 0) {
                    min = k - arr[i];
                    index = i;
                }
            }

            k = k - arr[index];
            count++;
        }

        out.write(count + "\n");
        out.flush();
        out.close();
    }
}
