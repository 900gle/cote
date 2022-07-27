package codility;


import java.util.HashSet;
import java.util.Set;

public class FrogJump {


    public static void main(String[] args) {

        int A[] = new int[8];
        A[0] = 1;
        A[1] = 3;
        A[2] = 1;
        A[3] = 4;
        A[4] = 2;
        A[5] = 3;
        A[6] = 5;
        A[7] = 4;

        int X = 5;
        System.out.println(solution(X, A));
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> jump = new HashSet<>();
        int ret = -1;

        for (int i = 0; i < A.length; i++) {
            if (X >= A[i]) {
                jump.add(A[i]);
            }

            if (jump.size() == X) {
                ret = i;
                break;
            }
        }
        return ret;
    }
}
