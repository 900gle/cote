package codility;

import java.util.Arrays;

public class ArrayLocation {

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] result = new int[A.length];

        for (int i =0; i < A.length; i++){
            int j = 0;
            if ((i+K) > A.length){
                j = (i+K) % A.length;
            } else {
                j = ((i+K)== A.length)? 0 : (i+K);
            }
            result[j]=A[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] A = new int[]{1, 2, 3, 4};
        int K = 4;

        Arrays.stream(solution(A, K)).forEach(x-> System.out.println(x));

//        System.out.println(solution(A,K));
    }
}
