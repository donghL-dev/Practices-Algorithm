package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Number : 14910
 Problem URL : https://www.acmicpc.net/problem/14910
 ***/
public class _14910 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int[] arr = new int[str2.length];
        int[] arr2 = new int[str2.length];
        int count = 0;

        for(int i=0; i<str2.length; i++) {
            int x = Integer.valueOf(str2[i]);
            if(x < -1000000 || x > 1000000)
                System.exit(0);
            arr[i] = x;
            arr2[i] = x;
        }

        Arrays.sort(arr2);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == arr2[i])
                count += 1;
        }

        if(count == arr.length)
            System.out.println("Good");
        else
            System.out.println("Bad");
    }
}
