package baekjoon;

import java.io.*;

public class _10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int h = Integer.valueOf(str2[0]); // 층수
            int w = Integer.valueOf(str2[1]); // 방수
            int n = Integer.valueOf(str2[2]); // 몇번째 손님인지 나타낸다.
            int[][] hotel = new int[h][w];
            int answer = 101;
            int r = 101;
            int a = 0;
            int b = 0;

            for(int j=0; j<h; j++) {
                for(int k=0; k<w; k++) {
                    hotel[j][k] = r;
                    r++;
                }
                r += 100;
                r -= w;
            }

            for(int c=0; c<n; c++) {
                answer = hotel[a][b];
                a++;
                if(a == h) {
                    a = 0;
                    b++;
                }
            }

            System.out.println(answer);
        }

    }
}
