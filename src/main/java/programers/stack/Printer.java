package programers.stack;

//일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다.

import java.util.*;

public class Printer {

    public static void main(String[] args) {

        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;

        System.out.println(new Printer().solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {

        int answer = 0;
        int loca = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for (int i : priorities) {
            que.offer(i);
        }
//        System.out.println("===========================");
//        Arrays.stream(priorities).forEach(x-> System.out.println(x));
//        System.out.println("===========================");

        Arrays.sort(priorities);
        int size = priorities.length - 1;
        System.out.println("size =" + size);

//        System.out.println("===========================");
//        Arrays.stream(priorities).forEach(x-> System.out.println(x));
//        System.out.println("===========================");

        while (!que.isEmpty()) {
            Integer pri = que.poll();
            System.out.println("i : " + pri + " priorities[size - answer] : " + priorities[size - answer]);

            if (pri == priorities[size - answer]) {
                answer++;
                loca--;
                if (loca < 0)
                    break;
            } else {
                que.offer(pri);
                loca--;
                if (loca < 0)
                    loca = que.size() - 1;
            }

            System.out.println("location : " + loca);
        }

        return answer;

    }

}
