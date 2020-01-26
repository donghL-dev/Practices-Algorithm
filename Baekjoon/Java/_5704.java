package baekjoon;

import java.io.*;

public class _5704 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = in.readLine();

            if(str.equals("*"))
                System.exit(0);

            if(str.length() <= 200) {
                char a = 'a';
                int answer = 0;
                int[] result = new int[26];

                for (int k = 0; k < result.length; k++) {
                    for (int z = 0; z < str.length(); z++) {
                        if (str.charAt(z) == a) {
                            result[k] += 1;
                        }
                    }
                    a++;
                }

                for (int s = 0; s < result.length; s++) {
                    if (result[s] >= 1)
                        answer += 1;
                }

                if (answer == 26)
                    System.out.println("Y");
                else
                    System.out.println("N");

            }
        }
    }
}
