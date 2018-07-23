package baekjoon.IO;

import java.io.*;
import java.io.BufferedReader;

//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램.
public class _1001_ {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String srt = in.readLine();

        String[] srt2 = srt.split(" ");

        int b = Integer.parseInt(srt2[0]);
        int a = Integer.parseInt(srt2[1]);

        System.out.println(b - a);
    }
}
