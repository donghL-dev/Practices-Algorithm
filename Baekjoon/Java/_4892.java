package baekjoon;

import java.io.*;

/***
 Problem Name : 숫자 맞추기 게임
 Problem Number : 4892
 Problem Link : https://www.acmicpc.net/problem/4892
 ***/
public class _4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while(true) {
            int n0 = Integer.valueOf(in.readLine());
            int n1 = n0*3;
            int n2 = 0;

            if(n0 == 0)
                break;

            if(n1%2 == 0)
                n2 = n1/2;
            else
                n2 = (n1+1)/2;

            int n3 = n2*3;
            int n4 = n3/9;

            System.out.println( i + ". " + (n1%2 == 0 ? "even " : "odd ") + n4);
            i++;
        }
    }
}
