package baekjoon;

import java.util.*;

/***
 Problem Number : 16170
 Problem Link : https://www.acmicpc.net/problem/16170
 ***/

public class _16170 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(cal.YEAR);
        int month = cal.get(cal.MONTH)+1;
        int date = cal.get(cal.DATE);

        System.out.println(year);
        System.out.println(month);
        System.out.println("0"+date);
    }
}
