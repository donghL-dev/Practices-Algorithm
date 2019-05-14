package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 평균운 넘겠지
 Problem Number : 4344
 Problem Link : https://www.acmicpc.net/problem/4344
 ***/
public class _4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.valueOf(in.readLine());

        for(int i=0; i<c; i++) {
            StringTokenizer token = new StringTokenizer(in.readLine());
            int n = Integer.valueOf(token.nextToken());
            int[] arr = new int[n];
            double avl = 0;
            double answer = 0;

            for(int j=0; j<n; j++) {
                arr[j] = Integer.valueOf(token.nextToken());
                avl += arr[j];
            }

            for(int k=0; k<n; k++) {
                if(arr[k] > avl/n)
                    answer++;
            }

            out.write(String.format("%.3f", ((answer / n) * 100)) + "%\n");
        }

        out.flush();
        out.close();
    }
}
