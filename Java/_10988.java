package baekjoon;

import java.io.*;

/***
 Probelm Name : 팰린드롬인지 확인하기.
 Problem Number : 10988
 Problem Link : https://www.acmicpc.net/problem/10988
 ***/
public class _10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = in.readLine();

        if (palindrome(input, 0))
            out.write('1');
        else
            out.write('0');

        out.flush();
        out.close();
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
