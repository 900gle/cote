package codility;

import java.util.Arrays;

public class ArrayCouple {

    public static void main(String[] args) {

        int[] A = new int[]{9, 3, 9, 3, 9, 7, 9};


        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1) {
                return A[i];
            }
            if (A[i] == A[i + 1]) {
                i++;
            } else {
                result = A[i];
            }
        }
        return result;
    }
}
