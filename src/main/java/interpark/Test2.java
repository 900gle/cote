package interpark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
//
//        int n = 2;
//        System.out.println(new Test2().solution(n));


        int n = 4;

        int total = n;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }


        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % i == 0) {

                    if (map.get(i) == 1) {
                        map.put(i, 0);
                        total--;
                    } else {
                        map.put(i, 1);
                        total++;
                    }
                }
            }

            for (int m : map.values()){

                System.out.println("i :: " +i + " ===  m :: " + m);
                System.out.println("--------------");
            }
            System.out.println("===================");
        }



        System.out.println(total);

    }

    public int solution(int n) {
        int answer = 3;
        return answer;
    }
}
