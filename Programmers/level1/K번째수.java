package programmers.level1;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            int startIndex = commands[i][0] - 1;
            int endIndex = commands[i][1] - 1;
            int resultIndex = 0;
            int[] result = new int[(endIndex - startIndex) + 1];


            for (int j=startIndex; j<=endIndex; j++) {
                result[resultIndex] = array[j];
                resultIndex++;
            }

            Arrays.sort(result);

            answer[i] = result[commands[i][2] - 1];
        }

        return answer;
    }
}
