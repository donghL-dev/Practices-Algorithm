package baekjoon;

import java.io.*;
import java.util.*;

// Problem : 어떤 글이 주어졌을 때, 가장 많이 나온 글자를 출력하는 프로그램.
// 자료형 char 를 이용하면 아스키코드로 문자의 크기를 비교가 가능하다.
public class _1371 {
    private  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int[] alphabet = new int[26];
        while ((str = in.readLine()) != null) { // while(sc.hasNextLine())
            int i;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }

        }

        int max = 0;
        for(int i=0; i<26; i++) {
            max = Math.max(max, alphabet[i]);
        }

        for(int i=0; i<26; i++) {
            if(alphabet[i] == max) {
                bw.write('a' + i);
            }
        }
        bw.flush();
    }
}
