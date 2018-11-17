package baekjoon;

import java.io.*;

/***
 Problem Name : Transactions
 Problem Number : 2975
 Problem Link : https://www.acmicpc.net/problem/2975
 ***/
public class _2975 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            if(str.equals("0 W 0"))
                break;

            int cur_balance = Integer.valueOf(str2[0]);
            String type = str2[1];
            int use_balance = Integer.valueOf(str2[2]);

            if(type.equals("W"))
                cur_balance -= use_balance;
            else
                cur_balance += use_balance;

            System.out.println(cur_balance >= -200 ? cur_balance : "Not allowed");
        }
    }
}
