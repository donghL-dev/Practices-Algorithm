package programmers.level2;

import java.math.BigInteger;

public class 멀쩡한_사각형 {
    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
    private static long solution(int w, int h) {
        long lw = (long) w;
        long lh = (long) h;

        BigInteger w1 = BigInteger.valueOf(lw);
        BigInteger h1 = BigInteger.valueOf(lh);

        return (lw * lh) - ((lw + lh) - h1.gcd(w1).longValue());
    }
}
