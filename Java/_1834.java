package baekjoon;

import java.io.*;

// Problem : N으로 나누었을 때 나머지와 몫이 같은 모든 자연수의 합을 구하는 프로그램.
public class _1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.valueOf(in.readLine());
        long sum = 0;

        for(int i=0; i<n; i++) {
            sum += (n+1)*i;
        }

        System.out.println(sum);


    }
}
