package baekjoon;

import java.io.*;

/***
 Problem Name : Kkung's Space travel
 Problem Number : 9501
 Problem Link : https://www.acmicpc.net/problem/9501
 ***/
public class _9501 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String str2[] = str.split(" ");

            int n = Integer.valueOf(str2[0]);
            int d = Integer.valueOf(str2[1]);
            int result = 0;
            for(int j=0; j<n; j++) {
                str = in.readLine();
                str2 = str.split(" ");

                int v = Integer.valueOf(str2[0]);
                int f = Integer.valueOf(str2[1]);
                int c = Integer.valueOf(str2[2]);
                double sum = 0;

                sum = (v*f)/c;
                if(d <= sum)
                    result++;
            }
            System.out.println(result);
        }
    }
}
