package codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {

        String S = "{[()()]}";
//        String S = "())(()";
//        String S = "([)()]";


        System.out.println(solution(S));


    }


    public static int solution(String S) {


        Stack<Character> stack = new Stack<>();

        char lastChar;
        for (char c : S.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                lastChar = stack.pop();
                if (c == ')' && lastChar != '(') {
                    return 0;
                }
                if (c == ']' && lastChar != '[') {
                    return 0;
                }
                if (c == '}' && lastChar != '{') {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }


}
