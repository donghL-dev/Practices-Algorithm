package baekjoon;

import java.io.*;

public class _5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str  = in.readLine();
        String[] str2 = str.split(" ");
        int e = Integer.valueOf(str2[0]);
        int f = Integer.valueOf(str2[1]);
        int c = Integer.valueOf(str2[2]);

        if(c < 1 || c > 2000)
            System.exit(0);
        if(e < 0 || e > 1000)
            System.exit(0);
        if(f < 0 || f > 1000)
            System.exit(0);

        int count = 0; // 현재 빈병으로 먹을수 있는 수.
        int nonbottle = e+f; // 현재 빈병.

        while(true) {
            if(nonbottle < c)
                break;
            count += nonbottle/c; // 빈병에 따른 새병의 갯수를 체크.
            nonbottle = (nonbottle%c) + (nonbottle/c); // 새롭게 나오는 빈병을 체크.
        }

        System.out.println(count);
    }
}
