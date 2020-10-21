package programers.heap;

import java.util.*;

public class SoHot {

    public static void main(String[] args) {


        int[] scoville = new int[]{12, 2, 3, 9, 10, 1};
        int k = 7;

        int ret = new SoHot().solution(scoville, k);

        System.out.println(ret);
    }


    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> foodPriorityQueue = new PriorityQueue<>();
        for (int c : scoville) {
            foodPriorityQueue.offer(c);
        }
        while (K >= foodPriorityQueue.peek()) {

            if(foodPriorityQueue.size() == 1){
                return  -1;
            }
            int food1 = foodPriorityQueue.poll();
            int food2 = foodPriorityQueue.poll();

            int mergeFood = food1 + (food2 * 2);
            foodPriorityQueue.offer(mergeFood);
            answer++;
        }

        return answer;
    }

}
