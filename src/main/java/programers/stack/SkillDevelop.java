package programers.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SkillDevelop {


    public static void main(String[] args) {


        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds  = new int[]{1, 1, 1, 1, 1, 1};

        int[] ret = solution(progresses, speeds);

        Arrays.stream(ret).forEach(x-> System.out.println(x));
    }
    public static int[] solution(int[] progresses, int[] speeds) {



        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.offer(((100 - progresses[i]) % speeds[i] == 0) ? (100 - progresses[i]) / speeds[i] : ((100 - progresses[i]) / speeds[i] + 1));
        }
        int deployCount = 1;
        int prePoll = queue.poll();

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            int nowPoll = queue.poll();
            if( prePoll >= nowPoll) {
                deployCount++;
            } else {
                list.add(deployCount);
                deployCount=1;
                prePoll = nowPoll;
            }
        }

        list.add(deployCount);

        int[] answer = new int[list.size()];

        for (int j=0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;

    }
}
