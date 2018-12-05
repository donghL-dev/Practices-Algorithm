package baekjoon;

import java.io.*;

/***
 Problem Name : 단어 공부
 Problem Number : 1157
 Problem Link : https://www.acmicpc.net/status?user_id=dongh9508&problem_id=1157&from_mine=1
 ***/

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = in.readLine();
        int[] alphabet = new int[26];
        int max = 0;
        char result = '?';
        for(int i=0; i<input.length(); i++) {
            if (input.charAt(i) > 'Z')
                alphabet[input.charAt(i) - 97]++;
            else
                alphabet[input.charAt(i) - 65]++;
        }

        for(int i=0; i<alphabet.length; i++) {
            if(max < alphabet[i]) {
                max = alphabet[i];
                result = (char) (i + 65);
            }
            else if(max != 0 && alphabet[i] == max) {
                result = '?';
            }
        }

        bw.write(result);

        bw.flush();
        bw.close();
    }
}
