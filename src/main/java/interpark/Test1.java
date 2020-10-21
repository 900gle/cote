package interpark;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Test1 {



    public static void main(String[] args) {


        String answer = "";

        String S = "abcde";
        int[][] interval = new int[][]{{1,3}, {1,4},{4,5}};


        char[] list = new char[S.length()];
        for (int i = 0; i < S.length(); i ++){
            list[i] = S.charAt(i);
        }

        for(int i =0; i < interval.length; i++){
            int tempCount = interval[i][0]-1;
            for (int j = interval[i][1]-1; j>= interval[i][0]-1; j-- ) {
                list[tempCount] = S.charAt(j);
                tempCount++;
            }
            S ="";
            for (char c : list) {
                S += c;
            }
        }


        System.out.println( S );

//        int tempCount = 1-1;
//        for (int j = 3-1; j>= 1-1; j-- ) {
//            list[tempCount] = S.charAt(j);
//            tempCount++;
//        }

//        for ( char c : list){
//            System.out.println("c :: " +c);
//        }




//
//        for (int i = S.length() -1; i>=0; i--) {
//            System.out.print(str.charAt(i));
//        }


//        for (int j = 3-1; j>= 1-1; j-- ) {
//            System.out.println("J : " + j + "   S :: " + S.charAt(j));
//            answer += S.charAt(j);
//        }



//        System.out.println(answer);

//
//        for(int i =0; i < interval.length; i++){
//            int tempCount = interval[i][0]-1;
//
//            for (int j = interval[i][1]-1; j>= interval[i][0]-1; j-- ) {
//                list[tempCount] = S.charAt(j);
//                tempCount++;
//            }
//
//            S ="";
//            for (char c : list) {
//                S += c;
//            }
//        }
//
//        System.out.println("answer :: " + answer);

//        for (int i = S.length() -1; i>=0; i--) {
//
//            answer = answer+S.charAt(i);
//
//        }





//        System.out.println(new Test1().solution());
    }



    public String solution(String S, int[][] interval) {
        String answer = "";
        return answer;
    }
}
