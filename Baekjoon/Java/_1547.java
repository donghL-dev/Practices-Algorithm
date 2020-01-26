package baekjoon;

import java.io.*;

/***
 Problem Name : 공
 Problem Number : 1547
 Problem Link : https://www.acmicpc.net/problem/1547
 ***/

public class _1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        int a = 0;
        int b = 0;
        int m = Integer.valueOf(in.readLine());
        for(int i=0; i<m; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int x = Integer.parseInt(str2[0]);
            int y = Integer.parseInt(str2[1]);
            if(arr[0] == x && arr[1] == y) {
                a = arr[0];
                b = arr[1];
                arr[0] = b;
                arr[1] = a;
            }
            else if(arr[0] == x && arr[2] == y) {
                a = arr[0];
                b = arr[2];
                arr[0] = b;
                arr[2] = a;
            }
            else if(arr[1] == x && arr[0] == y) {
                a = arr[1];
                b = arr[0];
                arr[1] = b;
                arr[0] = a;
            }
            else if(arr[1] == x && arr[2] == y) {
                a = arr[1];
                b = arr[2];
                arr[1] = b;
                arr[2] = a;
            }
            else if(arr[2] == x && arr[0] == y) {
                a = arr[2];
                b = arr[0];
                arr[2] = b;
                arr[0] = a;
            }
            else if(arr[2] == x && arr[1] == y) {
                a = arr[2];
                b = arr[1];
                arr[2] = b;
                arr[1] = a;
            }
        }

        System.out.println(arr[0]);
    }
}
