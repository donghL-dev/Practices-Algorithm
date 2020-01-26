package baekjoon;

import java.io.*;

/***
  Problem Number : 3004
  Problem Link : https://www.acmicpc.net/problem/3004
 ***/
public class _3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        if(n < 0 || n > 100)
            System.exit(0);

        int m = ((n-1)/2)+1;

        if(n % 2 == 0) {
            System.out.println(((n/2)+1)*((n/2)+1));
        }
        else {
            int result = 0;
            for(int i=1; i<m; i++) {
                result += (2*i)+2;
            }
            System.out.println(result+2);
        }
    }
}
