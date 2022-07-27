package codility;

import java.util.Arrays;

public class MaxCounter {

    public static void main(String[] args) {

        int[] A = new int[7];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;

        int N = 5;
        Arrays.stream(solution(N, A)).forEach(x -> System.out.println("--"));
    }


    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
// write your code in Java SE 8
        int[] ret = new int[N];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                Arrays.sort(ret);
                for (int j = 0; j < N; j++) {
                    ret[j] = ret[(N-1)];
                }
            } else {
                ret[(A[i] - 1)] = ret[(A[i] - 1)] + 1;
            }

        }

        return ret;
    }

}
