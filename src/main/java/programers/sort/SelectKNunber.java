package programers.sort;

import java.util.Arrays;

//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.


public class SelectKNunber {

    public static void main(String[] args) {



    }

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int j = 0;
        for (int[] sub : commands){
            int[] temp = Arrays.copyOfRange(array, sub[0]-1, sub[1]);
            Arrays.sort(temp);
            answer[j] = temp[sub[2] - 1];
            j++;
        }

        return answer;
    }
}


