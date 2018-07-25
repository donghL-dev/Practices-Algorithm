package baekjoon._for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Problem : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램.
public class _2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int n = Integer.parseInt(str);

        if(n<1 || n>9)
            return;

        for(int i=1; i<=9; i++) {
            System.out.println(n + " * " + i + " = " + n*i );
        }
    }
}
