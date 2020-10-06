package programers.stack;

import java.util.Arrays;

public class StockPrice {


    public static void main(String[] args) {

        int[] prices = new int[]{1, 2, 3, 2, 3};

       int[] ret = solution(prices);

        Arrays.stream(ret).forEach(x-> System.out.println(x));


    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
                if(j == answer.length -1) answer[i] = j-i;
            }
        }
        return answer;
    }
}
