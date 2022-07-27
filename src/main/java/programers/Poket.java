package programers;

import java.util.Arrays;
import java.util.function.LongToIntFunction;

public class Poket {


    public static void main(String[] args) {

        int[] arr = {3,1,2,3};



    }


    public static int solution(int[] nums) {
        int answer = 0;




        int getNum = nums.length / 2;

        long disNum = Arrays.stream(nums).distinct().count();

      long  answera = getNum > disNum ? disNum : getNum;




        return Long.valueOf(answera).intValue();
    }
}
