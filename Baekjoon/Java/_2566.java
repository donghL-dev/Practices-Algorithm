package baekjoon;

import java.io.*;

public class _2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<9; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.valueOf(str2[j]);
            }
        }

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    count1 = i+1;
                    count2 = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(count1 + " " + count2 );

    }
}
