package study.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortTest {

    public static void main(String[] args) {

        String[] numbers = new String[]{"6", "10", "2"};

//내림차순
//        Arrays.sort(numbers, new Comparator<>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2+o1).compareTo(o1+o2);
//            }
//        });

//        Arrays.sort(numbers, Collections.reverseOrder()); //내림


//        Arrays.sort(numbers); //오름

        Arrays.stream(numbers).forEach(x-> System.out.println(x));


//        오름차순

    }


}
