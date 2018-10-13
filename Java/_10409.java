package baekjoon;

import java.io.*;

/***
 Problem Number : 10409
 Problem Link : https://www.acmicpc.net/problem/10409
 ***/

public class _10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        int n = Integer.valueOf(str2[0]);
        int t = Integer.valueOf(str2[1]);

        if(n < 1 || n > 50 || t < 1 || t > 500)
            System.exit(0);

        int[] arr = new int[n];

        str = in.readLine();
        str2 = str.split(" ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.valueOf(str2[i]);
            if(arr[i] > 100)
                System.exit(0);
        }

        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(sum + arr[i] <= t) {
                sum += arr[i];
                count++;
            }
            else
                break;
        }

        System.out.println(count);

    }
}
