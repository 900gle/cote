package codility;

import java.util.Arrays;

public class Absolute {

    public static void main(String[] args) {

        int[] A = new int[5];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 3;

        System.out.println(solution(A));


    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
// write your code in Java SE 8
        int ret = A[0];
        for (int k = 1; k < A.length; k++) {
            int a = 0;
            int b = 0;

            for (int i = 0; i < A.length; i++) {
                if (k > (i)) {
                    a += A[i];
                } else {
                    b += A[i];
                }
            }

            int abs = Math.abs(a - b);
            if (ret > abs) {
                ret = abs;
            }
        }
        return ret;
    }

}
