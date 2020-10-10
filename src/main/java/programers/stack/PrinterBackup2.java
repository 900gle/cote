package programers.stack;

//일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterBackup2 {

    public static void main(String[] args) {

        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;

        System.out.println(new PrinterBackup2().solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {


        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);

        int size = priorities.length-1;



        while(!que.isEmpty()) {
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;

    }

}
