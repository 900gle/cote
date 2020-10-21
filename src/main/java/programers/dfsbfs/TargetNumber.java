package programers.dfsbfs;

public class TargetNumber {

    public static void main(String[] args) {

        int[] numbers = new int[]{ 1, 1, 1, 1, 1};
        int target = 3;


        System.out.println(new TargetNumber().solution(numbers, target));


    }
static int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0);

        return answer;


    }


    public static void  dfs(int[] numbers, int target, int index) {

            if(index == numbers.length){
                int sum = 0;
                for (int num : numbers) sum += num;
                if (sum == target)
                    answer++;

            } else {
                numbers[index] *= 1;
                dfs(numbers, target, index+1);

                numbers[index] *= -1;
                dfs(numbers, target, index+1);
            }
    }


}

