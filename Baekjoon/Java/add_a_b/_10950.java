package baekjoon.add_a_b;

import java.util.*;
// Problem : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램.
public class _10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] num = new int[t];

        for(int i=0; i<t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            num[i] = x+y;
        }

        for(int i=0; i<t; i++) {
            System.out.println(num[i]);

        }

    }
}
