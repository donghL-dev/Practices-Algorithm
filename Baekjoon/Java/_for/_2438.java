package baekjoon._for;

import java.io.*;

// Problem : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제.
public class _2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int num = Integer.parseInt(str);

        for(int i=1; i<=num; i++) {
            if(i>1)
                System.out.println();
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
        }
    }
}
