package programers.hash;

import java.util.HashMap;


//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

public class Player {

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"kiki", "eden"};

        String notName = solution(participant, completion);
        System.out.println(notName);

    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> pMap = new HashMap<>();

        for (String pName : participant) {
            pMap.put(pName, pMap.getOrDefault(pName, 0) + 1);
        }

        for (String cName : completion) {
            pMap.put(cName, pMap.get(cName) - 1);
        }

        String answer = "";
        for (String name : pMap.keySet()) {
            if (pMap.get(name) > 0) {
                answer = name;
            }
        }

        return answer;

    }
}
