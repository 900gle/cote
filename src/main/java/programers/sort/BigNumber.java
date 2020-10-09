package programers.sort;


import java.util.Arrays;
import java.util.Comparator;

//0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
public class BigNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{6, 10, 2};
        System.out.println(new BigNumber().solution(numbers));
    }

    public String solution(int[] numbers) {
        String answer = "";
        String newNumbers[] = new String[numbers.length];

        for(int i=0; i<newNumbers.length; i++) {
            newNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(newNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(newNumbers[0].startsWith("0")) {
            answer += "0";
        } else {
            for(int j=0; j<newNumbers.length; j++) {
                answer += newNumbers[j];
            }
        }

        return answer;
    }
}
