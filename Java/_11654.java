package baekjoon;

import java.io.*;
// Problem : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램.
public class _11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char ch = in.readLine().charAt(0);

        System.out.println((int) ch);

    }
}
