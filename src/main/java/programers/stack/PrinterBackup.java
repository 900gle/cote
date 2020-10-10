package programers.stack;

//일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrinterBackup {

    public static void main(String[] args) {

        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;

        System.out.println(new PrinterBackup().solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {


        int answer = 0;
        List<Integer> prior = new ArrayList<Integer>();
        List<Integer> loc = new ArrayList<Integer>(); // 위치정보 할당.



        for (int i = 0; i < priorities.length; i++) {
            prior.add(priorities[i]);
            loc.add(i);
        }



        int count = 0;
        while (true) {
            int l = loc.get(0);
            int p = prior.get(0);
            loc.remove(0);
            prior.remove(0);
            if (prior.size() == 0) {
                answer += count + 1;
                break;
            } // 꺼낸값보다 우선순위가 높은게 있다면 다시 큐안으로..
            if (Collections.max(prior) > p) {
                prior.add(p);
                loc.add(l);
            } // 꺼낸값보다 우선순위가 높은게 큐에 없다면 출력
            else {
                count += 1;
                if (location == l) {
                    answer = count;
                    break;
                }
            }
        }
        return answer;

    }

}
