package baekjoon;

import java.io.*;

public class _2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        for(int i=0; i<str2.length; i++) {
            if(Integer.valueOf(str2[i]) < 1 || Integer.valueOf(str2[i]) > 5)
                System.exit(0);
            else if(str2[0].equals("1")  && str2[1].equals("2") && str2[2].equals("3") && str2[3].equals("4") && str2[4].equals("5"))
                System.exit(0);
        }

        for(int i=0; i<str2.length-1; i++) {
            for(int j=0; j<str2.length-1; j++) {
                if(Integer.valueOf(str2[j]) > Integer.valueOf(str2[j+1])) {
                    String str4 = str2[j];
                    str2[j] = str2[j+1];
                    str2[j+1] = str4;
                    for(int k=0; k<str2.length; k++) {
                        System.out.print(str2[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
