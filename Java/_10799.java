package baekjoon;

import java.io.*;
import java.util.*;

public class _10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        String str = in.readLine();
        String[] str2 = str.split("");
        int sum = 0;

        if(str2.length > 100000)
            System.exit(0);

        for(int i=0; i<str2.length; i++) {
            if(str2[i].equals("(")) {
                stack.push(str2[i]);
            }
            else  {
                stack.pop();
                if(str2[i-1].equals("("))
                    sum += stack.size();
                else
                    sum += 1;
            }
        }

        System.out.println(sum);
    }
}
