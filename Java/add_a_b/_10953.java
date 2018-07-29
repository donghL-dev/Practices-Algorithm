package baekjoon.add_a_b;

import java.io.*;
import java.util.StringTokenizer;

public class _10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(",");
            //StringTokenizer st = new StringTokenizer(in.readLine(), ",");
            //System.out.println(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken()));
            System.out.println(Integer.valueOf(str2[0]) + Integer.valueOf(str2[1]));
        }

    }
}
