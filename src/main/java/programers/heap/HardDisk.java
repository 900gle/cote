package programers.heap;

import java.util.PriorityQueue;

public class HardDisk {

    public static void main(String[] args) {

        int[][] jobs =  new int[][] {{0,3},{1,9}, {2,6}};
        System.out.println("ret :" + new HardDisk().solution(jobs));
    }

    class Work implements Comparable<Work> {

        int sec;
        int work;

        public Work (int sec, int work){
            this.sec = sec;
            this.work = work;
        }

        @Override
        public int compareTo(Work work) {
            return this.work > work.work ? 1 : -1;
        }
    }

    public int solution(int[][] jobs) {

        int answer = 0;

        PriorityQueue<Work> workPriorityQueue = new PriorityQueue<>();

        for (int[] ints : jobs){

            workPriorityQueue.offer(new Work(ints[0], ints[1]));
        }

        int total = 0;
        int sum = 0;
        while (!workPriorityQueue.isEmpty()){
//            System.out.println(workPriorityQueue.peek().work);

            total = (workPriorityQueue.peek().work) + total;

            sum = total - workPriorityQueue.poll().sec;

            System.out.println("total : "+total);

        }

        answer = sum / jobs.length;

        return answer;
    }
}
