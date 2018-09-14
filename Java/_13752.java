package baekjoon;

import java.io.*;

public class _13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        for(int i=0; i<n; i++) {
            int x = Integer.valueOf(in.readLine());
            for(int j=0; j<x; j++)
                System.out.print("=");
            System.out.println();
        }

    }
}
