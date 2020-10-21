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

//        참가자 맵을 만든다 getOrdeffault - 없으면 0 있으면 + 1;
        for (String pName : participant) {
            pMap.put(pName, pMap.getOrDefault(pName, 0) + 1);
        }

//        완주자 배열에서 참가자 맵의 value 값을 가져와서 -1 을 해주면 완주하지 못한놈이 1로 남는 된
        for (String cName : completion) {
            pMap.put(cName, pMap.get(cName) - 1);
        }

        String answer = "";
        for (String name : pMap.keySet()) {
            if (pMap.get(name) > 0) {
                answer = name;
            }
        }

//        0보다 큰놈 추출 그놈이 범인이다.
        return answer;

    }
}
