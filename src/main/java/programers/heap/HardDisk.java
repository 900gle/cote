package programers.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HardDisk {

    public static void main(String[] args) {

        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {2, 6}};
        System.out.println("ret :" + new HardDisk().solution(jobs));
    }

    class Work implements Comparable<Work> {

        int sec;
        int work;

        public Work(int sec, int work) {
            this.sec = sec;
            this.work = work;
        }

        @Override
        public int compareTo(Work o) {

            if (this.work < o.work) return -1;
            else if (this.work == o.work) {
                if (this.sec < o.sec) return -1;
                else return 1;
            } else return 1;

        }
    }

    public int solution(int[][] jobs) {

        int tempTime = 0;
        int totalTime = 0;
        int answer = 0;

        PriorityQueue<Work> workPriorityQueue = new PriorityQueue<>();
        for (int[] ints : jobs) {
            workPriorityQueue.offer(new Work(ints[0], ints[1]));
        }

        List<Work> list = new ArrayList<>();
        while (!workPriorityQueue.isEmpty()) {
            list.add(workPriorityQueue.poll());
        }

        while (list.size()>0) {
            for (int i = 0; i < list.size(); i++) {
                if (tempTime >= list.get(i).sec) {
                    tempTime += list.get(i).work;
                    totalTime += tempTime - list.get(i).sec;
                    list.remove(i);
                    break;
                }
                if (i == list.size()-1) totalTime++;
            }
        }

        answer  = (int)totalTime/jobs.length;
        return answer;
    }
}
