package baekjoon;

import java.util.Calendar;
// Problem : 현재 날짜와 시간을 출력하는 프로그램.
public class _10699 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(cal.YEAR);
        int month = cal.get(cal.MONTH)+1;
        int date = cal.get(cal.DATE);

        System.out.println(year +"-0"+month+"-"+ date);
    }
}