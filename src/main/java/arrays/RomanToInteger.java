package arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> mapper = new HashMap<>();
        mapper.put('I', 1);
        mapper.put('V', 5);
        mapper.put('X', 10);
        mapper.put('L', 50);
        mapper.put('C', 100);
        mapper.put('D', 500);
        mapper.put('M', 1000);

        int result = 0;
        var next = mapper.get(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++){
            var current = mapper.get(s.charAt(i));
            next = mapper.get(s.charAt(i+1));

            if(current >= next){
                result += current;
            } else {
                result += (-current);
            }
        }

        result += next;

        return result;
    }

    public static void main(String[] args) {
        var roman = new RomanToInteger();
        var romanInput = "D";
        int result = roman.romanToInt(romanInput);
        System.out.println(result);
    }
}
