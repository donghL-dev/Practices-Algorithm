package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : Editor
 Problem Number : 1406
 Problem Link : https://www.acmicpc.net/problem/1406
 ***/
public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();
        StringBuilder stringBuffer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        Stack<Character> store = new Stack<>();
        int n = Integer.valueOf(in.readLine());

        for(int i=0; i<input.length(); i++)
            stack.push(input.charAt(i));

        while(n-- > 0) {
            String condition = in.readLine();
            if(condition.equals("L")) {
                if (!stack.empty())
                    store.push(stack.pop());
            }
            else if(condition.equals("D")) {
                if(!store.empty())
                    stack.push(store.pop());
            }
            else if(condition.equals("B")) {
                if(!stack.empty())
                    stack.pop();
            }
            else {
                char ch = condition.charAt(2);
                stack.push(ch);
            }
        }

        while(!stack.empty())
            store.push(stack.pop());

        while(!store.empty())
            stringBuffer.append(store.pop());

        out.write(String.valueOf(stringBuffer));
        out.flush();
        out.close();
    }
}
