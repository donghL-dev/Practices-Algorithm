package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 2007
 Problem Number : 1924
 Problem Link : https://www.acmicpc.net/problem/1924
 ***/
public class _1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] weeks = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        StringTokenizer  token = new StringTokenizer(in.readLine());
        int x = Integer.valueOf(token.nextToken());
        int y = Integer.valueOf(token.nextToken());
        String[][] answer = new String[12][31];
        int week = 0;

        for(int i=0; i<x; i++) {
            if(i == 3 || i == 5 || i == 8 || i == 10) {
                for(int j=0; j<30; j++) {
                    answer[i][j] = weeks[week++];
                    if(week > 6)
                        week = 0;
                }
            }
            else if(i == 1) {
                for(int j=0; j<28; j++) {
                    answer[i][j] = weeks[week++];
                    if(week > 6)
                        week = 0;
                }
            }
            else {
                for(int j=0; j<31; j++) {
                    answer[i][j] = weeks[week++];
                    if(week > 6)
                        week = 0;
                }
            }
        }

        out.write(answer[x-1][y-1] + "\n");
        out.flush();
        out.close();
    }
}
