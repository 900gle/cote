package programers.hash;

import java.util.Arrays;

public class Phone {

    public static void main(String[] args) {

        String[] phone_book = new String[]{"119", "97674223", "1195524421"};
        boolean bool = solution(phone_book);
        
        System.out.println(bool);

    }

    public static boolean solution(String[] phone_book) {

        boolean answer = true;
        for (String phone : phone_book) {
            answer = Arrays.stream(phone_book).filter(x -> !x.equals(phone)).noneMatch(x -> x.startsWith(phone));
            if (answer == false) {
                return answer;
            }
        }
        return answer;


    }
}
