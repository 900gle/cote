package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tri {

    public static void main(String[] args) {

        int[] A = new int[6];
//        A[0] = -3;
//        A[1] = 1;
//        A[2] = 2;
//        A[3] = -2;
//        A[4] = 5;
//        A[5] = 6;

        A[0] = -5;
        A[1] = 5;
        A[2] = -5;
        A[3] = 4;

        System.out.println(solution(A));


    }


    public static int solution(int[] A) {
        Arrays.sort(A);

        System.out.println(A[A.length-1] + "*" + A[A.length-2] +" * " + A[A.length-3]);
        return A[A.length-1] * A[A.length-2] * A[A.length-3];

    }

}
