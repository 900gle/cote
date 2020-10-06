package step2;
import java.util.Arrays;

public class TestCote {

    public static void main(String[] args) {


        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};



    }

    public static int[] solution(int[] array, int[][] commands) {
//        int[] answer = {};


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
