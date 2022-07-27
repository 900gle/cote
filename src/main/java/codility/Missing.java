package codility;

import java.util.Arrays;

public class Missing {

    public static void main(String[] args) {

        int A[] = new int[4];
        A[0] = 2;
        A[1] = 3;
        A[2] = 1;
        A[3] = 5;

        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i+1;
            }
        }
        return A.length+1;
    }
}
