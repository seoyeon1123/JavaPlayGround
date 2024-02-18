package algorithm;

import java.util.Stack;

public class AlgorithmMain {


    public static boolean checkParentheses(String inputString) {
        Stack<Character> stack = new Stack<>();

        for (char ch : inputString.toCharArray()) {
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        // 예시 1
        String inputStr = "((())())";
        boolean result = checkParentheses(inputStr);
        System.out.println(result);  // Output: true

        //예시 2
        String inputStr2 = "(()()))(";
        boolean result2 = checkParentheses(inputStr2);
        System.out.println(result2);

        //예시3
        String inputStr3 = "((())";
        boolean result3 = checkParentheses(inputStr3);
        System.out.println(result3);
    }
}
