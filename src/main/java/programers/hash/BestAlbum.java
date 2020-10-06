package programers.hash;

import java.util.*;

public class BestAlbum {

//    스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

    public static void main(String[] args) {

        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        int [] ret = solution(genres, plays);

    }

    public static int[] solution(String[] genres, int[] plays) {

        Map<String, Integer> rankHash = new HashMap<>();
        for (int i = 0; i < plays.length; i++) {
            rankHash.put(genres[i], rankHash.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(rankHash.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int comparision = (o1.getValue() - o2.getValue()) * -1;
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
            }
        });
        List<Integer> answerList = new ArrayList<>();
        list.stream().forEach(x -> {
                    Map<Integer, Integer> tempMap = new HashMap<>();
                    for (int j = 0; j < genres.length; j++) {
                        if (genres[j].equals(x.getKey())) {//
                            tempMap.put(j, plays[j]);
                        }
                    }

                    List<Map.Entry<Integer, Integer>> listTemp = new LinkedList<>(tempMap.entrySet());
                    Collections.sort(listTemp, new Comparator<Map.Entry<Integer, Integer>>() {
                        @Override
                        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                            int comparision = (o1.getValue() - o2.getValue()) * -1;
                            return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
                        }
                    });
                    listTemp.stream().map(k -> k.getKey()).limit(2).forEach(k -> answerList.add(k));
                }
        );

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;




    }

}


