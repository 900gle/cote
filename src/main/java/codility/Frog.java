package codility;

public class Frog {

    public static void main(String[] args) {

        int X = 10;
        int Y = 85;
        int D = 30;


        System.out.println(solution(X, Y, D));

    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int ret = 0;
        int n = (Y - X) / D;
        if ((Y - X) % D == 0) {
            ret = n;
        } else {
            ret = n + 1;
        }
        return ret;
    }


}
