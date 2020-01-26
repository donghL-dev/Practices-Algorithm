package baekjoon;

import java.io.*;

/***
 Problem Name : 명장 남정훈
 Problem Number : 15734
 Problem Link : https://www.acmicpc.net/problem/15734
 ***/
public class _15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        int l = Integer.valueOf(str2[0]);
        int r = Integer.valueOf(str2[1]);
        int a = Integer.valueOf(str2[2]);

        while(l != r || a != 0) {
            if(a == 0) {
                if(l < r)
                    r--;
                else
                    l--;
                continue;
            }
            if(l < r) {
                l++;
                a--;
            }
            else if(l == r) {
                if(a%2 == 1)
                    l++;
                else
                    r++;
                a--;
            }
            else {
                r++;
                a--;
            }
        }
        System.out.println(l+r);
    }
}
