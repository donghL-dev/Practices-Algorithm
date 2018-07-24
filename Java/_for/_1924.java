package baekjoon._for;

import java.io.*;

public class _1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine().trim();

        String[] str2 = str.split(" ");
        int x = Integer.parseInt(str2[0]);
        int y = Integer.parseInt(str2[1]);

        String[] day = {"SUN", "MON", "TUS", "WEN", "TUE", "FRI", "SAT"};

        int[] s1 = {31,28,31,30,31,30,31,31,30,31,30,31};

        int count = 0;

        for(int i=0; i<x; i++) {
            if(i+1 == x)
                count += y;
            else
                count += s1[i];
        }

        System.out.println(day[count%7]);

    }
}
