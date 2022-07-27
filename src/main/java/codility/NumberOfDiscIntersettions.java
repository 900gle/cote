package codility;

import java.util.Arrays;

public class NumberOfDiscIntersettions {

    public static void main(String[] args) {

        int[] A = new int[6];
        A[0] = 1;
        A[1] = 5;
        A[2] = 2;
        A[3] = 1;
        A[4] = 4;
        A[5] = 0;
        System.out.println("--------");
        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8

        int N = A.length;
        long[] lower = new long[N];
        long[] upper = new long[N];

        for (int i = 0; i < N; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersection = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            while (j < N && upper[i] >= lower[j]) {
                intersection += j;
                intersection -= i;
                j++;
            }
        }

        if (intersection > 10000000) return -1;
        return intersection;

    }

}
