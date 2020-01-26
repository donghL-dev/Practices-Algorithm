package baekjoon;

import java.io.*;

/***
 Problem Number : 2846
 Problem Link : https://www.acmicpc.net/problem/2846
 ***/

public class _2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int[] arr = new int[n];
        Integer[] count = new Integer[n-1];

        if(n < 1 || n > 1000)
            System.exit(0);

        String str = in.readLine();
        String[] str2 = str.split(" ");

        int sum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = Integer.valueOf(str2[i]);
            if(arr[i] < 1 || arr[i] > 1000)
                System.exit(0);
            sum += arr[i];
            if(i < n-1)
                count[i] = 0;
        }

        if(sum/n == n) {
            System.out.println(0);
            System.exit(0);
        }

        count[0] = 0;
        for(int i=0; i<n-1; i++) {
            System.out.println(i+"A");
            for(int j=i+1; j<n; j++) {
                System.out.println(j+"B");

                if (arr[i] < arr[j]) {
                    if(count[i] < arr[j] - arr[i])
                        count[i] = arr[j] - arr[i];
                    System.out.println(count[i]);
                }
                if( j < n-1) {
                    if (arr[j] == arr[j+1])
                        break;
                    if (arr[j] > arr[j+1])
                        break;
                }

            }
        }

        int max = 0;
        for(int i=0; i<n-1; i++) {
            if(count[i] != null && max < count[i])
                max = count[i];
        }

        System.out.println(max);
    }
}
