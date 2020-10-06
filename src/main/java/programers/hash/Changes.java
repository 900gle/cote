package programers.hash;

import java.util.Arrays;
import java.util.HashMap;

//스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
public class Changes {


    public static void main(String[] args) {

        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int sol = solution(clothes);

        System.out.println(sol);

    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Arrays.stream(clothes).forEach(
                x -> {
                    hm.put(x[1], hm.getOrDefault(x[1], 0) + 1);
                }
        );
        answer = hm.values().stream().map(x -> x + 1).reduce(1, (a, b) -> a * b) - 1;
        return answer;
    }
}
