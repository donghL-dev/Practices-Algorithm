package baekjoon;

import java.io.*;

/***
 Problem Number : 2798
 Problem Link : https://www.acmicpc.net/problem/2798
 ***/
public class _2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        int n = Integer.valueOf(str2[0]);
        int m = Integer.valueOf(str2[1]);
        int[] arr = new int[n];
        int min = m;

        str = in.readLine();
        str2 = str.split(" ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.valueOf(str2[i]);
        }

        int result = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                for(int k = j+1; k<arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] <= m) {
                        int a = arr[i] + arr[j] + arr[k] - m;
                        if (a < 0)
                            a *= -1;
                        if (a < min) {
                            min = a;
                            result = arr[i] + arr[j] + arr[k];

                            if (min == 0) {
                                System.out.println(result);
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);

    }
}
