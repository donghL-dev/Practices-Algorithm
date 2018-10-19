package baekjoon;

import java.io.*;

/***
 Problem Number : 1259
 Problem Link : https://www.acmicpc.net/problem/1259
 ***/

public class _1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in ));
        while(true) {
            String s = in.readLine();

            if(s.equals("0"))
                break;

            if(palindrome(s, 0))
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
    private static boolean palindrome(String s, int i) {
        if ((s.length() - 1 - i) - i <= 1) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i))
                return true;
            else
                return false;
        }
        else if (s.charAt(i) == s.charAt(s.length() - 1 - i))
            return palindrome(s, i + 1);
        else
            return false;
    }
}
