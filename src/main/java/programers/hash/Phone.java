package programers.hash;

import java.util.Arrays;


//전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
//        전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.


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
