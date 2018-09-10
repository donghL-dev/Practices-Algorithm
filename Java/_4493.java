package baekjoon;

import java.io.*;
// R, P, S -> 바위, 보, 가위 -> R > S, S > P,  P > R
public class _4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        int player1 = 0;
        int player2 = 0;
        String[] result = new String[t];

        if(t < 0 || t > 1000)
            System.exit(0);

        for(int i=0; i<t; i++) {
            int n = Integer.valueOf(in.readLine());
            for(int j=0; j<n; j++) {
                String str = in.readLine();
                String[] str2 = str.split(" ");
                if((str2[0].equals("R") && str2[1].equals("S")) || (str2[0].equals("S") && str2[1].equals("P")) ||
                        (str2[0].equals("P") && str2[1].equals("R")))
                    player1 += 1;
                if((str2[1].equals("R") && str2[0].equals("S")) || (str2[1].equals("S") && str2[0].equals("P")) ||
                        (str2[1].equals("P") && str2[0].equals("R")))
                    player2 += 1;
            }
            if(player1 > player2)
                result[i] = "Player 1";
            else if(player2 > player1)
                result[i] = "Player 2";
            else
                result[i] = "TIE";
            player1 = 0;
            player2 = 0;
        }

        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
