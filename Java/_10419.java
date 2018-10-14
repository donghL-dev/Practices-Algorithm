package baekjoon;

import java.io.*;

public class _10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            int d = Integer.valueOf(in.readLine()); // 수업시간
            int count = 0; // 최대 지각시간

            for(int j=1; j<=d; j++) {
                if(j+j*j <= d)
                    count = j;
            }

            System.out.println(count);
        }
    }
}
