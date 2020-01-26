package programmers.level2;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class 프린터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
    private static int solution(int[] priorities, int location) {
        PriorityQueue priorityQueue = new PriorityQueue(Collections.reverseOrder());
        IntStream.rangeClosed(0, priorities.length - 1).forEach(i -> priorityQueue.add(priorities[i]));
        int count = 1;

        while (!priorityQueue.isEmpty()) {
            for (int i=0; i<priorities.length; i++) {
                if (priorities[i] == (int) priorityQueue.peek()) {
                    if (i == location)
                        return count;
                    priorityQueue.poll();
                    count++;
                }
            }
        }

        return count;
    }
}
