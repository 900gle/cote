package study.reg;

import java.util.regex.Pattern;

public class NumberCheck {

    public static void main(String[] args) {


        Pattern p = Pattern.compile("^[0-9]{1,10}\\.?[0-9]{1,9}?$");
//        Pattern p = Pattern.compile("^\\d*(\\.?\\d*)");

        String text = "2020-01";


        System.out.println("find : " + p.matcher(text).find());

        if (p.matcher(text).find()) {
            System.out.println("통과");
        } else {
            System.out.println("통과아님");

        }
    }


}
