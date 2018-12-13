package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 조세퍼스 문제
 Problem Number : 1158
 Problem Link : https://www.acmicpc.net/problem/1158
 ***/
public class _1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = in.readLine();
        String[] str = input.split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);
        int result[] = solveJosephusProblem(n, m);

        for(int i=0; i<result.length; i++) {
            if(result.length == 1) {
                out.write("<" + result[i] + ">");
                break;
            }
            if (i == 0)
                out.write("<" + result[i] + ", ");
            else if (i != result.length - 1)
                out.write(result[i] + ", ");
            else
                out.write(result[i] + ">\n");
        }

        out.flush();
        out.close();
    }
    private static int[] solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        int result[] = new int[n];
        int j = 0;
        for(int i=1; i<=n; i++)
            queue.add(i);
        while(queue.size() != 1) {
            for(int i=0; i<k-1; i++) {
                int a = queue.removeFirst();
                queue.addLast(a);
            }
           result[j++] = queue.removeFirst();
        }
        result[j] = queue.get(0);
        return result;
    }
}
