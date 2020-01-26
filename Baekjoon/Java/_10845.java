package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : Queue
 Problem Number : 10845
 Problem Link : https://www.acmicpc.net/problem/10845
 ***/
public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.valueOf(in.readLine());
        for(int i=0; i<n; i++) {
            String input = in.readLine();
            String[] str = input.split(" ");
            String command = str[0];
            int integer = 0;
            if(str.length > 1)
                integer = Integer.valueOf(str[1]);

            if(command.equals("push"))
                queue.add(integer);
            else if(command.equals("pop")) {
             if(queue.size() > 0)
                out.write(queue.removeFirst() + "\n");
             else
                out.write("-1\n");

            }
            else if(command.equals("size"))
                out.write(queue.size()+ "\n");
            else if(command.equals("empty")) {
                if(queue.isEmpty())
                    out.write("1\n");
                else
                    out.write("0\n");
            }
            else if(command.equals("front")) {
                if(queue.size() == 0)
                    out.write("-1\n");
                else
                    out.write(queue.get(0) + "\n");
            }
            else {
                if(queue.size() == 0)
                    out.write("-1\n");
                else
                    out.write(queue.get(queue.size() - 1) + "\n");
            }
            out.flush();
        }
        out.close();
    }
}
