package baekjoon;

import java.io.*;
// Problem : 팩토리얼 계산 결과 출력 프로그램.
public class _10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int result = 1;

        if(n < 0)
            System.exit(0);

        for(int i=1; i<=n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
