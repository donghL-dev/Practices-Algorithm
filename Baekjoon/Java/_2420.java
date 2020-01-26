package baekjoon;

import java.io.*;

// Problem : 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
// 둘쩨 줄에 두 유명도의 차이 (|N-M|)을 출력한다.

public class _2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        long n = Long.valueOf(str2[0]);
        long m = Long.valueOf(str2[1]);
        long sub = n - m;

        if(sub < 0) {
            long sub2 = sub * sub;
            long sub3 = sub + (sub * -2);
            sub = sub2 / sub3;
        }

        System.out.println(sub);

    }
}
