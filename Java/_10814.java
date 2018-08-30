package baekjoon;

import java.io.*;
import java.util.*;

public class _10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        String[][] str = new String[n][2];

        for(int i=0; i<n; i++) {
            String str2 = in.readLine();
            String[] str3 = str2.split(" ");
            str[i][0] = str3[0];
            str[i][1] = str3[1];
        }

        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.valueOf(o1[0]), Integer.valueOf(o2[0]));
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(str[i][0] + " " + str[i][1]);
        }


    }
}
