package baekjoon.IO;

import java.util.Scanner;

public class _11718_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            if(str.isEmpty() || str.length() > 100)
                break;
            else
                System.out.println(str);
        }

    }
}
