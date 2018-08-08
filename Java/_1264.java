package baekjoon;

import java.io.*;
// Problem : 영문 문장을 입력받아 모음의 개수를 세는 프로그램.
// 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자이다.
public class _1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int count = 0;
        while (true) {
            String str = in.readLine();
            String[] str2 = str.split("");
            if(str2[0].equals("#")) {
                break;
            }
            for(int i=0; i<str2.length; i++) {
                if(str2[i].equals("a")  || str2[i].equals("e") || str2[i].equals("i") || str2[i].equals("o") || str2[i].equals("u"))
                    count++;
                else if(str2[i].equals("A") || str2[i].equals("E") || str2[i].equals("I") || str2[i].equals("O") || str2[i].equals("U"))
                    count++;
            }
            System.out.println(count);
            count = 0;
        }


    }
}
