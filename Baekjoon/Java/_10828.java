package baekjoon;

import java.util.*;
import java.io.*;
// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램
public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        int n = Integer.valueOf(in.readLine());

        for(int i=0; i<n; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int x;
            if(str2[0].equals("push")) {
                x = Integer.valueOf(str2[1]);
                stack.push(x);
            }
            if(str2[0].equals("top")) {
                if(stack.empty() == true) {
                    System.out.println(-1);
                } else
                    System.out.println(stack.peek());
            }
            if(str2[0].equals("size"))
                System.out.println(stack.size());
            if(str2[0].equals("pop")) {
              if(stack.empty() == true) {
                  System.out.println(-1);
              } else
                 System.out.println(stack.pop());
            }
            if(str2[0].equals("empty")) {
                if(stack.empty() == false)
                    System.out.println(0);
                else
                    System.out.println(1);
            }
        }

    }
}
