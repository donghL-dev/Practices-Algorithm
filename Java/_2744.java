package baekjoon;

import java.io.*;
// Problem : 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램.
// 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
// 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
public class _2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        if (str.length() > 100) {
            System.exit(0);
        }

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char ch = str.charAt(i);
                System.out.print((char) (ch + ('a' - 'A')));
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                char ch = str.charAt(i);
                System.out.print((char) (ch - ('a' - 'A')));
            }
            else
                System.exit(0);
        }

    }
}


