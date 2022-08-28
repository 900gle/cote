package study.contains;

public class ContainsTest {

    public static void main(String[] args) {


        String regExp = "^[0-9]*$";


        String test  = "10:";


      if(  test.matches(regExp)) {
          System.out.println("number");
      } else {
          System.out.println("numberXXX");

      }


    }
}
