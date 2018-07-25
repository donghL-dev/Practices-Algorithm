package baekjoon._for;

import java.io.*;

//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램
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
