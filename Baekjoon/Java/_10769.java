package baekjoon;

import java.io.*;

/***
 Problem Number : 10769
 Problem Link : https://www.acmicpc.net/problem/10769
 ***/

public class _10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int happy = 0;
        int sad = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ':' && str.charAt(i+1) == '-' && str.charAt(i+2) == ')')
                happy++;
            if(str.charAt(i) == ':' && str.charAt(i+1) == '-' && str.charAt(i+2) == '(')
                sad++;
        }

        if(happy == 0 && sad == 0)
            System.out.println("none");
        else if(happy > sad)
            System.out.println("happy");
        else if(happy < sad)
            System.out.println("sad");
        else
            System.out.println("unsure");
    }
}
