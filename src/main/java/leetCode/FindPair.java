package leetCode;

import java.util.HashSet;
import java.util.Set;

public class FindPair {
    public static boolean findPair(int[] numbers, int sum) {
        Set<Integer> counter = new HashSet<>();

        for (var number : numbers){
            if (counter.contains(number)){
                return true;
            } else {
                counter.add(sum-number);
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        int sum = 7;

        boolean result = FindPair.findPair(numbers, sum);
        System.out.println(result);
    }
}
