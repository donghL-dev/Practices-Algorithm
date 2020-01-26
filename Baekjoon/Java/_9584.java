package baekjoon;

import java.io.*;

/***
 Problem Name : Fraud Busters
 Problem Number : 9584
 Problem Link : https://www.acmicpc.net/problem/9584
 ***/
public class _9584 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine(); // 번호판
        int t = Integer.valueOf(in.readLine());
        String[] str2 = new String[t];

        for(int i=0; i<t; i++) {
            str2[i] = in.readLine();
        }

        int star = 0; // * 갯수 카운트.
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '*')
                star++;
        }

        Integer[] arr = new Integer[t];
        int result = 0;

        for(int i=0; i<t; i++) {
            int count = 0;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) != '*')
                    if(str.charAt(j) == str2[i].charAt(j))
                        count++;
            }
            if(count == str.length()-star) {
                result++;
                arr[i] = i;
            }
            else
                arr[i] = null;
        }

        System.out.println(result);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != null)
                System.out.println(str2[arr[i]]);
        }
    }
}
