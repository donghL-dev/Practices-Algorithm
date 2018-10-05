package baekjoon;

import java.io.*;

public class _15963 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        if(str2[0].equals(str2[1]))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
