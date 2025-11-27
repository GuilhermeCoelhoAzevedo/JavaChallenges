package neetCode250.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        int a = 0;
        int b = 0;

        for (String t : tokens){
            switch(t){
                case "+":
                    stack.add(stack.pop() + stack.pop());
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.add(b - a);
                    break;
                case "*":
                    stack.add(stack.pop() * stack.pop());
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.add(b / a);
                    break;
                default:
                    stack.add(Integer.valueOf(t));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        //String[] tokens = {"1","2","+","3","*","4","-"};
        String[] tokens = {"4","13","5","/","+"};
        int result = EvaluateReversePolishNotation.evalRPN(tokens);
        System.out.println(result);
    }
}
