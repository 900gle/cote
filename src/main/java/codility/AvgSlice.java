package codility;

import java.util.Arrays;

public class AvgSlice {

    public static void main(String[] args) {

        int[] A = new int[7];
        A[0] = 4;
        A[1] = 2;
        A[2] = 2;
        A[3] = 5;
        A[4] = 1;
        A[5] = 5;
        A[6] = 8;

        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8

        float min = (A[0] + A[1]) / 2;
        int minIndex = 0;

        for(int i = 2; i < A.length; i++){

            float avg = (A[i-2] + A[i-1] + A[i]) / 3f;
            if(min > avg) {
                min = avg;
                minIndex = i-2;
            }

            avg = ( A[i-1] + A[i]) / 2f;
            if(min > avg) {
                min = avg;
                minIndex = i-1;
            }
        }

        return minIndex;
    }

}
