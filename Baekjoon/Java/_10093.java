package baekjoon;

import java.io.*;

public class _10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");
        long a = Long.valueOf(str2[0]);
        long b = Long.valueOf(str2[1]);
        long arr = a > b ? a-b : b-a;

        if(arr > 0) {
            System.out.println(arr - 1);
            for(int i=0; i<arr-1; i++) {
                System.out.print((a > b ? b : a) + 1 + i + " ");
            }
        }
        else
            System.out.println(arr);
    }
}
