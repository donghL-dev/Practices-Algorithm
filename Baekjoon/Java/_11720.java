package baekjoon;

import java.io.*;
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램
public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int count = 0;

        String[] str2 = new String[n];
        String str = in.readLine();
        str2 = str.split("");

        for(int i=0; i<n; i++) {
            int a = Integer.valueOf(str2[i]);
            count += a;
        }

        System.out.print(count);
    }
}
