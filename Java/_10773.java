package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : 제로
 Problem Number : 10773
 Problem Link : https://www.acmicpc.net/problem/10773
 ***/
public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        int k = Integer.valueOf(in.readLine());

        for(int i=0; i<k; i++) {
            String str = in.readLine();
            if(str.equals("0") && !list.isEmpty())
                list.remove(list.size()-1);
            else
                list.add(Integer.valueOf(str));
        }

        int sum = 0;
        for(int i=0; i<list.size(); i++) {
            sum += list.get(i);
        }

        out.write(sum + "\n");
        out.flush();
        out.close();
    }
}
