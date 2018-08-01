package baekjoon;

import java.io.*;

public class _15802 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = in.readLine();

        if(str.equals("Donghun"))
            bw.write("1");
        else
            bw.write("0");
        bw.flush();
    }
}
