package baekjoon.arithmetic_operation;

import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        /*
        if(n<=3 || n>=5000)
            return;

        if((n%5)%3 != 0) {
            System.out.println(-1);
        }

        if(n%5 == 0)
            System.out.println(n%5);
        else if(n%5%2 == 1)
            System.out.println(n%5+1);
        else
            System.out.println(n%5+2);

        */

        if((num%5)%3 != 0) {
            System.out.println(-1);
        }else {
            if(num%5 != 0) {
                System.out.println((num/5)+(num%5)/3);
            }else {
                System.out.println(num/5);
            }
        }
        sc.close();
        }
}

