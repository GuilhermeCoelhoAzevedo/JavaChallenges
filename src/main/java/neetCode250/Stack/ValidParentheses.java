package neetCode250.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapper = new HashMap<>();
        mapper.put('[', ']');
        mapper.put('{', '}');
        mapper.put('(', ')');

        for (char c : s.toCharArray()){
            if (mapper.containsKey(c)){
                stack.push(mapper.get(c));
            } else {
                if (stack.isEmpty() || ( c != stack.pop())){
                    return false;
                }
            }
        }

        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        //String s = "([{}])";
        String s = "[(])";
        System.out.println(ValidParentheses.isValid(s));
    }
}
