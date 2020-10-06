package programers.hash;

import java.util.HashMap;

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
