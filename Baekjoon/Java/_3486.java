package baekjoon;

import java.io.*;

/***
 Problem Number : 3486
 Problem Link : https://www.acmicpc.net/problem/3486
 ***/
public class _3486 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        for(int i=0; i<n; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            String[] newstr = new String[str2.length];

            for(int z=0; z<newstr.length; z++) {
                newstr[z] = "";
            }

            for(int j=0; j<str2.length; j++) {
                for(int k=str2[j].length()-1; k>=0; k--) {
                    newstr[j] += str2[j].charAt(k);
                }
            }

            int x = Integer.valueOf(newstr[0]) + Integer.valueOf(newstr[1]);
            String sum = String.valueOf(x);
            String result = "";

            for(int k=sum.length()-1; k>=0; k--) {
                result += sum.charAt(k);
            }

            int count = 0;

            if(result.charAt(0) == '0') {
                for(int j=0; j<result.length(); j++) {
                    if(result.charAt(j) != '0') {
                        count = j;
                        break;
                    }
                }
            }

            for(int j=count; j<result.length(); j++) {
                System.out.print(result.charAt(j));
            }

            System.out.println();
        }
    }
}