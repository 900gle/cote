package codility;

import java.util.Arrays;

public class SoonArray {

    public static void main(String[] args) {

        int[] A = new int[5];
        A[0] = 4;
        A[1] = 1;
        A[2] = 3;
        A[3] = 2;

        System.out.println(solution(A));


    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
// write your code in Java SE 8
        int ret = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != (i + 1)) {
                return 0;
            }
        }
        return ret;
    }

}
