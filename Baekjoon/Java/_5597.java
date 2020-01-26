package baekjoon;

import java.io.*;
import java.util.*;
public class _5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        int[] arr2 = new int[28];


        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<28; i++) {
            arr2[i] = Integer.valueOf(in.readLine());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for(int i=0; i<30; i++) {
            for(int j=0; j<28; j++) {
                if(arr[i] == arr2[j])
                    arr[i] = 0;
            }
        }

        for(int i=0; i<30; i++) {
            if(arr[i] != 0)
                System.out.println(arr[i]);
        }

    }
}

