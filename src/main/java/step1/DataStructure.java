package step1;

import java.util.ArrayList;
import java.util.Iterator;

public class DataStructure {

    public static void main(String[] args) {

        ArrayListDoo arrayListDoo = new ArrayListDoo();
        arrayListDoo.addLast(30);
        arrayListDoo.addLast(20);
        arrayListDoo.addLast(20);
        arrayListDoo.addLast(20);
        arrayListDoo.add(2, 10);

//        System.out.printf(String.format("Last : %d", arrayListDoo.get(0) ));

        arrayListDoo.addFirst(arrayListDoo.size());
        System.out.printf(arrayListDoo.toString());
//        System.out.printf(String.format("indexOf : %d",arrayListDoo.indexOf(20)));
    }
}
