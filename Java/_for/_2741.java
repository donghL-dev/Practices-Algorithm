package baekjoon._for;

import java.io.*;
// Problem : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램.
public class _2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int n = Integer.parseInt(str);

        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }
}
