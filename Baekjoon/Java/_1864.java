package baekjoon;

import java.io.*;

/***
 Problem Number : 1864
 Problem Link : https://www.acmicpc.net/problem/1864
 */
public class _1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = in.readLine();
            int[] arr = new int[str.length()];

            if(str.equals("#"))
                break;

            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == '-')
                    arr[i] = 0;
                else if(str.charAt(i) == '\\')
                    arr[i] = 1;
                else if(str.charAt(i) == '(')
                    arr[i] = 2;
                else if(str.charAt(i) == '@')
                    arr[i] = 3;
                else if(str.charAt(i) == '?')
                    arr[i] = 4;
                else if(str.charAt(i) == '>')
                    arr[i] = 5;
                else if(str.charAt(i) == '&')
                    arr[i] = 6;
                else if(str.charAt(i) == '%')
                    arr[i] = 7;
                else if(str.charAt(i) == '/')
                    arr[i] = -1;
            }

            int sum = 0;
            for(int i=0; i<arr.length; i++) {
                sum += arr[i] * multiply(arr.length-1-i);
            }

            System.out.println(sum);


        }
    }
    private static int multiply(int i) {
        if(i == 0) return 1;
        return 8 * multiply(i-1);
    }
}
