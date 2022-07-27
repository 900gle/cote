package programers;

public class AstricPhoneNumber {


    public static void main(String[] args) {

        String phone = "12314534444";

        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < phone.length();i++){

            System.out.println(phone.charAt(i));

            if(i < (phone.length() - 3))
                ret.append("*");
            else
                ret.append(phone.charAt(i));

//            return ret.toString();

        }


    }
}
