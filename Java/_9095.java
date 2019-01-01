package baekjoon;

import java.io.*;

/***
 Problem Name : 1, 2, 3 더하기
 Problem Number : 9095
 Problem Link : https://www.acmicpc.net/problem/9095
 ***/
public class _9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[11];

        int t = Integer.valueOf(in.readLine());

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine());
            for(int j=4; j<=n; j++)
                arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
            out.write(arr[n] + "\n");
            out.flush();
        }
        out.close();
    }
}
