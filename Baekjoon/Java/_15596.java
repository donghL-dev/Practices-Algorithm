package baekjoon;

import java.util.*;

/***
 Problem Name : 정수 N개의 합.
 Problem Number : 15596
 Problem link : https://www.acmicpc.net/problem/15596
 ***/
public class _15596 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[random.nextInt(1000001)];
        for(int i=0; i<a.length; i++) {
            a[i] = random.nextInt(3000000)+1;
        }
        System.out.println(sum(a));
    }
    private static long sum(int a[]) {
        long sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
