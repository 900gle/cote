package programers.stack;

import java.util.LinkedList;
import java.util.Queue;

public class TruckBridge {

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = new int[] {7,4,5,6};

      int ret =  new TruckBridge().solution(bridge_length, weight, truck_weights);

        System.out.println("ret : " + ret);
    }
    class Truck {
        int weight;
        int entry;

        Truck(int weight, int entry){
            this.weight = weight;
            this.entry = entry;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> waiting = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();

        for(int i = 0 ; i < truck_weights.length ; ++i){
            waiting.offer(new Truck(truck_weights[i], 0));
        }

        int time = 0;
        int totalWeight = 0;

        while(!waiting.isEmpty() || !bridge.isEmpty()){
            time++;
            if(!bridge.isEmpty()) {
                Truck t = bridge.peek();


                System.out.println("!bridge.isEmpty == time :: " +time+" t.entry :: " +t.entry+" bridge_length :: "+ bridge_length);

                if(time - t.entry >= bridge_length) {
                    totalWeight -= t.weight;
                    bridge.poll();
                }
            }

            if(!waiting.isEmpty()) {

                System.out.println("!waiting.isEmpty == totalWeight :: " +totalWeight+" waiting.peek().weight :: " +waiting.peek().weight+" weight :: "+ weight);

                if(totalWeight + waiting.peek().weight <= weight) {
                    Truck t = waiting.poll();
                    totalWeight += t.weight;

                    bridge.offer(new Truck(t.weight, time));
                }
            }

            System.out.println("----- -- -- -- -- ");
        }
        return time;
    }
}
//엔트리가 move  이동중이면 현재 시간을 엔트리에 입력 1초인 트럭은 3초 일때 엔트리 -1 다리 길이를 지나간다  그때 bridge 에서  토탈 무계에서 트럭의 무계를 빼주고  poll시킨다