package baekjoon;

import java.math.BigInteger;
import java.util.*;

// Problem : 두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을 구하는 프로그램
public class _2355 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();


        if(a > b) {
            long temp = a;
            a =  b;
            b = temp;
        }

        BigInteger big1 = new BigInteger((b - a + 1) + "");
        BigInteger big2 = new BigInteger((a + b) + "");
        BigInteger result = big1.multiply(big2).divide(new BigInteger("2"));

        System.out.println(result);
    }
}
