package programmers.level1;

import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }
    private static int[] solution(int[] answers) {
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;

        int oneIndex = 0;
        int twoIndex = 0;
        int threeIndex = 0;

        for(int i=0; i<answers.length; i++) {
            if (answers[i] == one[oneIndex]) {
                oneCount += 1;
            }

            if (answers[i] == two[twoIndex]) {
                twoCount += 1;
            }

            if (answers[i] == three[threeIndex]) {
                threeCount += 1;
            }

            oneIndex++;
            twoIndex++;
            threeIndex++;

            if(oneIndex == one.length)
                oneIndex = 0;
            if (twoIndex == two.length)
                twoIndex = 0;
            if (threeIndex == three.length)
                threeIndex = 0;

        }


        if (oneCount == twoCount && twoCount == threeCount)
            return new int[]{1, 2, 3};
        else if (oneCount > twoCount && oneCount > threeCount)
            return new int[]{1};
        else if (oneCount == twoCount && twoCount > threeCount)
            return new int[]{1, 2};
        else if (oneCount == threeCount && threeCount > twoCount)
            return new int[]{1, 3};
        else if (twoCount > oneCount && twoCount > threeCount)
            return new int[]{2};
        else if (threeCount > twoCount && threeCount > oneCount)
            return new int[]{3};
        else
            return new int[]{2, 3};
    }
}
