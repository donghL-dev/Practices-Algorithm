package baekjoon;

import java.io.*;

public class _2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int num = 0;
        int max = 0;

        for(int i=0; i<arr.length; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int count = 0;
            for(int j=0; j<str2.length; j++) {
                if(Integer.valueOf(str2[j]) < 1 || Integer.valueOf(str2[j]) > 5 ) {
                    System.exit(0);
                }
                else
                    count += Integer.valueOf(str2[j]);
            }
            arr[i] = count;
            count = 0;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                num = i+1;
            }
        }

        System.out.print(num + " ");
        System.out.print(max);
    }
}
