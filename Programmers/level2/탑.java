package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class 탑 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{6, 9, 5, 7, 4})));
        System.out.println(Arrays.toString(solution(new int[]{3,9,9,3,5,7,2})));
        System.out.println(Arrays.toString(solution(new int[]{1,5,3,6,7,6,5})));
    }
    private static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int answerIndex = heights.length - 1;

        IntStream.rangeClosed(0, heights.length - 1).boxed().forEach(i -> stack.push(heights[i]));
        IntStream.rangeClosed(0, heights.length - 1).boxed().forEach(i -> list.add(heights[i]));

        while (!list.isEmpty()) {
            int current = stack.peek();
            boolean flag = false;

            for (int j=list.size() - 1; j>=0; j--) {
                if (current < list.get(j)) {
                    stack.pop();
                    list.remove(list.lastIndexOf(current));
                    answer[answerIndex] = j + 1;
                    flag = true;
                    answerIndex--;
                    break;
                }
            }

            if (!flag) {
                stack.pop();
                list.remove(list.lastIndexOf(current));
                answer[answerIndex] = 0;
                answerIndex--;
            }
        }

        return answer;
    }
}
