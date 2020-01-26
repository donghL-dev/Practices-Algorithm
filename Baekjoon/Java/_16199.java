package baekjoon;

import java.time.*;
import java.io.*;
public class _16199 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String str2 = in.readLine();
        String[] str3 = str.split(" ");
        String[] str4 = str2.split(" ");

        LocalDate birthday = LocalDate.of(Integer.valueOf(str3[0]), Integer.valueOf(str3[1]) , Integer.valueOf(str3[2]));
        LocalDate now = LocalDate.of(Integer.valueOf(str4[0]), Integer.valueOf(str4[1]), Integer.valueOf(str4[2]));
        LocalDate current = now.withYear(birthday.getYear());

        System.out.println(now.getYear() - birthday.getYear() - 1 + (current.isEqual(birthday) || current.isAfter(birthday) ? 1 : 0));
        System.out.println(now.getYear() - birthday.getYear() + 1);
        System.out.println(now.getYear() - birthday.getYear());
    }
}
