package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : Dequeue
 Problem Number : 10866
 Problem Link : https://www.acmicpc.net/problem/10866
 ***/
public class _10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> dequeue = new LinkedList<>();

        int input = Integer.valueOf(in.readLine());
        while(input-- > 0) {
            String input2 = in.readLine();
            if(input2.contains("push_back")) {
                String[] str2 = input2.split(" ");
                dequeue.addLast(Integer.valueOf(str2[1]));
            }
            else if(input2.contains("push_front")) {
                String[] str2 = input2.split(" ");
                dequeue.addFirst(Integer.valueOf(str2[1]));
            }
            else if(input2.contains("pop_front")) {
                if(dequeue.isEmpty())
                    out.write("-1\n");
                else
                    out.write(dequeue.removeFirst() + "\n");
            }
            else if(input2.contains("pop_back")) {
                if(dequeue.isEmpty())
                    out.write("-1\n");
                else
                    out.write(dequeue.removeLast() + "\n");
            }
            else if(input2.equals("size"))
                out.write(dequeue.size() + "\n");
            else if(input2.equals("empty")) {
                if(dequeue.isEmpty())
                    out.write("1\n");
                else
                    out.write("0\n");
            }
            else if(input2.equals("front")) {
                if(dequeue.isEmpty())
                    out.write("-1\n");
                else
                    out.write(dequeue.get(0) + "\n");
            }
            else {
                if(dequeue.isEmpty())
                    out.write("-1\n");
                else
                    out.write(dequeue.get(dequeue.size()-1) + "\n");
            }
            out.flush();
        }
        out.close();
    }
}
