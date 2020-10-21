package study.stream;

import java.util.Arrays;
import java.util.List;

public class StreamForeach {
    private static int cont = 0;

//    public static int getCount(){
//        return this.cont;
//    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa", "bb");



        list.stream().forEach(x->{

            System.out.println(cont);
            cont++;
        });




    }
}
