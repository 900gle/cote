package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static void main(String[] args) {

        int[] A = new int[6];
        A[0] = 2;
        A[1] = 1;
        A[2] = 1;
        A[3] = 2;
        A[4] = 3;
        A[5] = 1;

        System.out.println(solution(A));


    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
// write your code in Java SE 8
        Set<Integer> integerSet = new HashSet<>();
        for (int a : A){
            integerSet.add(a);
        }
        return integerSet.size();
    }

}
