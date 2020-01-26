package baekjoon;

import java.io.*;

/***
 Problem Name : mathematical curiosity
 Problem Number : 9094
 Problem Link : https://www.acmicpc.net/problem/9094
 */
public class _9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int n = Integer.valueOf(str2[0]);
            int m = Integer.valueOf(str2[1]);
            int count = 0;

            for(int j=1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    double x = j;
                    double y = k;
                    Double result = ((x * x) + (y * y) + m) / (x * y);

                    if (result == result.intValue())
                        count++;
                }
            }

            System.out.println(count);
        }
    }
}
