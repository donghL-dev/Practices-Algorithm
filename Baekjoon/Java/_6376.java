package baekjoon;

/***
 Problme Name : e Calculation
 Problem Number : 6376
 Problem Link : https://www.acmicpc.net/problem/6376
 ***/
public class _6376 {
    public static void main(String[] args) {

        System.out.println("n e");
        System.out.println("- -----------");

        System.out.printf("%d %.0f\n", 0, e(0));
        System.out.printf("%d %.0f\n", 1, e(1));
        System.out.printf("%d %.1f\n", 2, e(2));

        for(int i=3; i<10; i++) {
            System.out.printf("%d %.9f\n", i, e(i));
        }

    }
    private static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
    private static double e(int n) {
        double e = 0;
        for(int i=0; i<=n; i++) {
            e += (double) 1 / factorial(i);
        }
        return e;
    }
}
