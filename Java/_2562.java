package baekjoon;

import java.io.*;
// Problem : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램.
public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[9];
        int count = 0;
        int max = 0;
        for(int i=0; i<num.length; i++) {
            num[i] = Integer.valueOf(in.readLine());
            if(num[i] > 99)
                System.exit(0);
        }

        for(int i=0; i<num.length; i++) {
            if(num[i] > max) {
                max = num[i];
                count = i+1;
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}
