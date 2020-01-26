package programmers.level2;

import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {
        System.out.println(solution("()(((()())(())()))(())"));
        System.out.println(solution("(((()(()()))(())()))(()())"));
    }
    private static int solution(String arrangement) {
        Stack<Character> stack = new Stack<>();
        int leftBracket = 0;
        int answer = 0;

        for (int i=arrangement.length()-1; i>=0; i--) {
            stack.push(arrangement.charAt(i));
        }

        while (!stack.isEmpty()){
            char currentBracket = stack.pop();

            if (currentBracket == '(' && stack.peek() == ')') {
                answer += leftBracket;
                stack.pop();
                continue;
            }

            if (currentBracket == '(')
                leftBracket++;
            else {
                leftBracket--;
                answer++;
            }
        }

        return answer;
    }
}
