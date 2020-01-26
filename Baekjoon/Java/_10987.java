package baekjoon;

import java.io.*;
// Problem : 모음(a, e, i, o, u)의 개수를 출력하는 프로그램.
public class _10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u')
                count += 1;
        }
        System.out.println(count);
    }
}
