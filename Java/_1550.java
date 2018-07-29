package baekjoon;

import java.io.*;
// Problem : 첫째 줄에 16진수를 입력, 출력을 10진수로 하는 프로그램.
public class _1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int a = Integer.parseInt(str, 16);
        System.out.println(a);
    }
}
