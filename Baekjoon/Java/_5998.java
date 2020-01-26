package baekjoon;

import java.util.*;
import java.math.BigInteger;
// Problem : 입력한 숫자가 홀수인지 짝수인지 알 수 있는 프로그램.
public class _5998 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n;i++) {
            BigInteger x = sc.nextBigInteger();

            boolean c = x.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);

            if(c == true) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
