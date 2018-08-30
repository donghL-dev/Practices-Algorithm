package baekjoon;

import java.io.*;

public class _2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str2 = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        String str = in.readLine();
        double num = 4.3;

        for(int i=0; i<str2.length; i++) {
            if(str2[i].equals(str)) {
                if(str2[i].equals("F"))
                    num = 0.0;
                break;
            }

            String str3 = str2[i];
            String str4 = str2[i + 1];
            if(str3.charAt(0) != str4.charAt(0)) {
                num = num - 0.4;
            }
            else {
                num = num - 0.3;
            }
        }

        String number = String.format("%.1f", num);
        System.out.println(number);

    }
}
