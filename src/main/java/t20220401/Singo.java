package t20220401;

import java.util.*;
import java.util.stream.Collectors;

public class Singo {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 2;

        solution(id_list, report, k);
    }


    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        List<Integer> retInt = new ArrayList<>();
        Map<String, HashSet<String>> resultMap = new HashMap<>();
        Map<String, Integer> badMap = new HashMap<>();

        LinkedHashSet<String> linkedHashSet =
                new LinkedHashSet<>(Arrays.asList(report));
        String[] resultArr = linkedHashSet.toArray(new String[0]);

        for (int i = 0; i < resultArr.length; i++) {
            String[] reportArray = resultArr[i].split(" ");
            HashSet<String> temp = resultMap.getOrDefault(reportArray[0], new HashSet<>());
            temp.add(reportArray[1]);
            resultMap.put(reportArray[0], temp);

            badMap.put(reportArray[1], badMap.getOrDefault(reportArray[1], 0) + 1);
        }

        for (int j = 0; j < id_list.length; j++) {

            int n = 0;
            if (resultMap.get(id_list[j]) == null) {
                retInt.add(0);
            } else {
                HashSet<String> retList = resultMap.get(id_list[j]);

                Iterator iter = retList.iterator();    // Iterator 사용
                while (iter.hasNext()) {//값이 있으면 true 없으면 false
                    String st = (String) iter.next();
                    if (check(badMap, st, k)) {
                        n++;
                    }
                }
                retInt.add(n);
            }
        }

        answer = retInt.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    private static boolean check(Map<String, Integer> badMap, String s, int k) {
        int trueCount = badMap.get(s);
        if (trueCount >= k) {
            return true;
        } else {
            return false;
        }
    }
}
