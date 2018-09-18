package baekjoon;

import java.io.*;

public class _10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.valueOf(in.readLine());
        int y = Integer.valueOf(in.readLine());
        int z = Integer.valueOf(in.readLine());

        if((x < 0 || x > 180) || (y < 0 || y > 180) || (z < 0 || z > 180))
            System.exit(0);

        if(x == 60 && y == 60 && z == 60)
            System.out.println("Equilateral");
        else if((x+y+z == 180) && ( x == y || x == z || y == z )) {
            System.out.println("Isosceles");
        }
        else if(x+y+z == 180 && x != y && x != z && y != z ) {
            System.out.println("Scalene");
        }
        else {
            System.out.println("Error");
        }
    }
}
