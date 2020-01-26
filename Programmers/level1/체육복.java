package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class 체육복 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
        System.out.println(solution(7, new int[]{2,3,4}, new int[]{1, 2, 3, 6}));
    }
    private static int solution(int n, int[] lost, int[] reserve) {

        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> newLost = new ArrayList<>();
        List<Integer> blackList = new ArrayList<>();
        Iterator<Integer> iterator = reserveList.iterator();


        while (iterator.hasNext()) {
            int j = iterator.next();

            for (int i = 0; i<lost.length; i++) {
                if (lost[i] == j) {
                    iterator.remove();
                    blackList.add(lost[i]);
                } else {
                    if (!newLost.contains(lost[i]))
                        newLost.add(lost[i]);
                }
            }
        }

        for (int i : blackList) {
            newLost.remove(newLost.indexOf(i));
        }


        for (int i1 : newLost) {
            boolean flag = false;

            for (int j = 0; j < reserveList.size(); j++) {
                if ((i1 - 1 == reserveList.get(j)) || (i1 + 1 == reserveList.get(j))) {
                    reserveList.remove(j);
                    flag = true;
                    break;
                }
            }

            if(!flag)
                n--;
        }

        return n;
    }
}
