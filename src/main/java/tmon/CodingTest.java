package tmon;

public class CodingTest {

    public static void main(String[] args) {

        int number = 1;
        int count = 0;
        while (number > 0)
        {
            if ((number % 2 ) == 1){
                count++;
            }
            number = number / 2;

            System.out.println("number : " + number);
        }

//        return count;
        System.out.println("count : " + count);
    }


}
