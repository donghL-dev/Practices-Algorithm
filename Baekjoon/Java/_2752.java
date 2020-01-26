package baekjoon;

import java.io.*;
import java.util.*;
// Problem : 세 수를 입력 받아서 정렬시키는 프로그램.
public class _2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str3 = str.split(" ");
        int[] n = new int[str3.length];

        for(int i=0; i<str3.length; i++) {
            int x = Integer.valueOf(str3[i]);
            n[i] = x;
        }
        Arrays.sort(n);

        for(int i=0; i<n.length; i++) {
            System.out.print(n[i] + " ");
        }

    }
}
