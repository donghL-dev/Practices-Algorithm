package baekjoon;

import java.io.*;
// Problem : 연세대학교의 영문명은 YONSEI, 슬로건은 Leading the Way to the Future이다.
// 이를 출력하는 프로그램
public class _15680 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        if( n == 0)
            System.out.println("YONSEI");
        else if(n == 1)
            System.out.println("Leading the Way to the Future");
    }
}
