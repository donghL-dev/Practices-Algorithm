package baekjoon;

import java.io.*;
/***
Problem Number : 14645
Problem URL : https://www.acmicpc.net/problem/14645
 ***/
public class _14645 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String driver = "비와이";
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int n = Integer.valueOf(str2[0]);
        int k = Integer.valueOf(str2[1]);
        int count = k;

        if(n < 1 || n > 100000 || k < 1 || k > 10000)
            System.exit(0);

        for(int i=0; i<n; i++) {
            str = in.readLine();
            str2 = str.split(" ");
            int x = Integer.valueOf(str2[0]);
            int y = Integer.valueOf(str2[1]);
            count += x;
            count -= y;

            if(i == n-1)
                System.out.println(driver);
        }
    }
}
