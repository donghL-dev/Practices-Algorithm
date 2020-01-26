package baekjoon;

import java.io.*;
import java.util.*;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine(); // 괄호를 입력받고
            compare(str); // 함수로 이동한다.
        }

    }

    public static void compare(String str2) {
        int count = 0;
        char[] ch = str2.toCharArray(); // 괄호 문자열을 char 배열에 한문자씩 넣는다.
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == '(') // ch 배열의 인덱스에 (가 있을경우
                count++; // 카운트를 증가하고
            else
                count--; // )라면 마이너스를 한다.
            if(count < 0) { // 카운트가 0 미만이라면 NO를 출력하고 리턴시킨다.
                System.out.println("NO");
                return;
            }
        }

        if(count == 0) // 카운트가 0이라면 YES
            System.out.println("YES");
        else // 아니라면 NO
            System.out.println("NO");

    }
}



