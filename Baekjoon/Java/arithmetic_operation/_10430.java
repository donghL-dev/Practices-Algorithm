package baekjoon.arithmetic_operation;

import java.io.*;

// Problem : (A+B)%C는 (A%C + B%C)%C 와 같을까?
// (A×B)%C는 (A%C × B%C)%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램
public class _10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String srt = in.readLine();

        String[] srt2 = srt.split(" ");

        int a = Integer.parseInt(srt2[0]);
        int b = Integer.parseInt(srt2[1]);
        int c = Integer.parseInt(srt2[2]);

        System.out.println((a + b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c * b%c)%c);

    }
}
