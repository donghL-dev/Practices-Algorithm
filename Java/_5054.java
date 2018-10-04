package baekjoon;

import java.io.*;
import java.util.*;

public class _5054 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        if(t < 1 || t > 100)
            System.exit(0);

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine()); // 방문할 상점의 수.

            if(n < 1 || n > 20)
                System.exit(0);

            String str = in.readLine(); // 상점의 위치
            String[] str2 = str.split(" ");
            int[] arr = new int[str2.length];

            for(int j=0; j<n; j++) {
                arr[j] = Integer.valueOf(str2[j]);
                if(arr[j] < 0 || arr[j] > 99)
                    System.exit(0);
            }

            Arrays.sort(arr);

            int result = arr[arr.length-1] - arr[0];
            result = result/2;

            int min = arr[arr.length-1];
            int minindex = 0;
            int minus = 0;

            for(int k=0; k<arr.length; k++) {
                if(k != 0 && k != arr.length-1) {
                    minus = result - arr[k];
                    if(min > minus) {
                        min = minus;
                        minindex = k;
                    }
                }
            }
            int sum = 0;
            sum = arr[minindex] - arr[0];
            sum = sum*2;
            sum += (arr[arr.length-1] - arr[minindex])*2;
            System.out.println(sum);
        }
    }
}
