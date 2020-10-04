package step1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
