package baekjoon;

import java.io.*;

public class _3035 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        int r = Integer.valueOf(str2[0]);
        int c = Integer.valueOf(str2[1]);
        int zr = Integer.valueOf(str2[2]);
        int zc = Integer.valueOf(str2[3]);

        if(r < 1 || r > 50 || c < 1 || c > 50)
            System.exit(0);

        if(zr < 1 || zr > 5 || zc < 1 || zc > 5)
            System.exit(0);

        String[][] rc = new String[r][c];

        for(int i=0; i<r; i++) {
            str = in.readLine();
            str2 = str.split("");
            for(int j=0; j<c; j++) {
                rc[i][j] = str2[j];
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < zr; k++) {
                for (int j = 0; j < c; j++) {
                    for (int d = 0; d < zc; d++) {
                        System.out.print(rc[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
