package baekjoon.add_a_b;

import java.io.*;
import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램.
public class _10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
          int x = sc.nextInt();
          int y = sc.nextInt();

          System.out.println(x+y);
        }
    }
}
