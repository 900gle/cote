package programers.heap;

import java.util.*;

public class SoHot {

    public static void main(String[] args) {


        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int k = 7;

        new SoHot().solution(scoville, k);


    }


    class Food implements Comparable<Food> {
        int scoville;

        public Food(int scoville) {
            this.scoville = scoville;
        }

        public int getScoville(){
            return this.scoville;
        }
        @Override
        public int compareTo(Food o) {
            return this.scoville <= o.scoville ? 1 : -1;
        }
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Food> foodPriorityQueue = new PriorityQueue<>();

        for(int c : scoville){
            foodPriorityQueue.offer(new Food(c));
        }

        PriorityQueue<Food> sortQueue = new PriorityQueue<>(foodPriorityQueue.size(), Collections.reverseOrder());
        sortQueue.addAll(foodPriorityQueue);

        int food1 = 0;
        int food2 = 0;

        while (!sortQueue.isEmpty()){

            food1 = sortQueue.poll().getScoville();
            food2 = sortQueue.poll().getScoville();

//            if (food1 + (food2 * 2) > k){
//
//
//
//            }

            System.out.println(sortQueue.poll().getScoville());
        }


        System.out.println(sortQueue.size());

        return answer;
    }

}
