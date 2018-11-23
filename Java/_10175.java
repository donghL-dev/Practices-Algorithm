package baekjoon;

import java.io.*;
import java.util.*;

/***
 Problem Name : Dominant Species
 Problem Number : 10175
 Problem Link : https://www.acmicpc.net/problem/10175
 ***/
public class _10175 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());

        for(int i=0; i<t; i++) {
            String str = in.readLine();
            String[] str2 = str.split(" ");

            int species[] = new int[4];

            for(int j=0; j<str2[1].length(); j++) {
                if(str2[1].charAt(j) == 'B')
                    species[0] += 2;
                else if(str2[1].charAt(j) == 'C')
                    species[1] += 1;
                else if(str2[1].charAt(j) == 'M')
                    species[2] += 4;
                else
                    species[3] += 3;
            }

            int bobcat = species[0];
            int coyote = species[1];
            int lion = species[2];

            Arrays.sort(species);

            if(species[3] == species[2])
                System.out.println(str2[0] + ": " + "There is no dominant species");
            else {
                if(species[3] == bobcat)
                    System.out.println(str2[0] + ": " + "The Bobcat is the dominant species");
                else if(species[3] == coyote)
                    System.out.println(str2[0] + ": " + "The Coyote is the dominant species");
                else if(species[3] == lion)
                    System.out.println(str2[0] + ": " + "The Mountain Lion is the dominant species");
                else
                    System.out.println(str2[0] + ": " + "The Wolf is the dominant species");
            }
        }
    }
}
