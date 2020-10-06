package test.truck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TruckTest {

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = new int[]{7,4,5,6};

        System.out.printf("solution" + solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> trucks = new LinkedList<>();

        int time = 0;
        while (true){



            time++;
            break;

        }

        System.out.println(time);
        return answer;
    }
}
