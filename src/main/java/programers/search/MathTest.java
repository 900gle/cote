package programers.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MathTest {

    public static void main(String[] args) {
        int[] answers = new int[]{1,2,3,4,5};

        Arrays.stream(new MathTest().solution(answers)).forEach(x-> System.out.println(x));
    }

    public  int[] solution(int[] answers) {

        // 수포자 정보 (포기하지 마..)
        int supoCount = 3;
        int[][] supo = new int[][] { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 },
                { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

        // 답안 비교
        int[] result = new int[supoCount];
        for (int i = 0; i < answers.length; i++) {

            for (int j = 0; j < supoCount; j++) {
                if (answers[i] == supo[j][i % supo[j].length]) {
                    result[j]++;
                }
            }
        }

        // 최대값 산정
        int max = 0;
        for (int i = 0; i < supoCount; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }

        // 최대값이 0이면 아무도 못맞춤
        if (max == 0) {
            return new int[] {};
        }

        // 최대값과 같은 값을 가진 인덱스 추출
        List<Integer> winner = new ArrayList<Integer>();
        for (int i = 0; i < supoCount; i++) {
            if (result[i] == max) {
                winner.add(i);
            }
        }

        // 최종 배열 생성 및 정렬 후 리턴
        int size = winner.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = winner.get(i) + 1;
        }
        Arrays.sort(answer);

        return answer;
    }
}
