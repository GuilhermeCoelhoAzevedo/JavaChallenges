package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> mapper = new HashMap<>();
        mapper.put('(', ')');
        mapper.put('{', '}');
        mapper.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (var c : s.toCharArray()){
            if(mapper.containsKey(c)){
                stack.push(mapper.get(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }

        if(! stack.isEmpty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        var validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("([])"));
    }
}
