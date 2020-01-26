package baekjoon;

import java.io.*;

/***
 Problem Name : 알파벳 찾기
 Problem NUmber : 10809
 Problem Link : https://www.acmicpc.net/problem/10809
 ***/
public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        int alphabet[] = new int[26];
        int count[] = new int[input.length()];

        for(int i=0; i<alphabet.length; i++)
            alphabet[i] = -1;

        for(int i=0; i<input.length(); i++) {
            boolean check = true;
            for(int j=0; j<i; j++) {
                if(count[j] == input.charAt(i))
                    check = false;
            }
            if(check) {
                alphabet[input.charAt(i) - 'a'] = i;
            }
            count[i] = input.charAt(i);
        }

        for(int i=0; i<alphabet.length; i++) {
            out.write(alphabet[i] + " ");
        }

        out.flush();
        out.close();
    }
}
