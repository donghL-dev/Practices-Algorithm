package baekjoon;

import java.io.*;
// Problem : 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
// 한 줄에 10글자씩 끊어서 출력하는 프로그램
public class _11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split("");
        for(int i=0; i<str.length(); i++) {
            System.out.print(str2[i]);
            if((i+1) % 10 == 0 )
                System.out.println();
        }
    }
}
