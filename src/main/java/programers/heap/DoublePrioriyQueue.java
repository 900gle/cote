package programers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePrioriyQueue {

    public static void main(String[] args) {


//        String[] operations =    new String[]{"I 16","D 1"};
        String[] operations = new String[]{"I 7", "I 5", "I -5", "D -1"};

        int[] ints = new DoublePrioriyQueue().solution(operations);

        Arrays.stream(ints).forEach(x -> System.out.println(x));


    }


    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> priorityQueueWithMax = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> priorityQueueWithMin = new PriorityQueue<>();

        for (String operation : operations) {
            String[] splitOther = operation.split(" ");

            if (splitOther[0].equals("I")) {
                priorityQueueWithMax.add(Integer.parseInt(splitOther[1]));
                priorityQueueWithMin.add(Integer.parseInt(splitOther[1]));
            }

            if (splitOther[0].equals("D")) {
                if (!priorityQueueWithMax.isEmpty()) {
                    if (splitOther[1].equals("1")) {
                        int max = priorityQueueWithMax.peek();
                        priorityQueueWithMax.remove(max);
                        priorityQueueWithMin.remove(max);

                    } else {
                        int min = priorityQueueWithMin.peek();
                        priorityQueueWithMax.remove(min);
                        priorityQueueWithMin.remove(min);
                    }
                }
            }

        }
        if (!priorityQueueWithMax.isEmpty()) {
            answer[0] = priorityQueueWithMax.peek();
            answer[1] = priorityQueueWithMin.peek();

        }
        return answer;
    }
}
