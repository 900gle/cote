package study.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class TestQueue {

    public static void main(String[] args) {

        PriorityQueue<Student> priorityQueue = getPriorityQueueStudent();


//        while (!priorityQueue.isEmpty()) {
//
//            System.out.println(priorityQueue.poll());
//
//        }



        PriorityQueue<Student> priorityQueue2 = new PriorityQueue<>(priorityQueue.size(), Collections.reverseOrder());


        priorityQueue2.addAll(priorityQueue);


        while (!priorityQueue2.isEmpty()) {

            System.out.println(priorityQueue2.poll());

        }

    }


    static PriorityQueue<Student> getPriorityQueueStudent() {

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new Student("이두현", 39));
        priorityQueue.offer(new Student("전민주", 36));
        priorityQueue.offer(new Student("현승희", 26));
        priorityQueue.offer(new Student("최아린", 22));

        return priorityQueue;
    }


}
