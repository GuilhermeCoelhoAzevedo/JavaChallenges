package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap();

        for (var n : nums){
            if (counter.containsKey(n)){
                counter.put(n, counter.get(n) + 1);
            } else {
                counter.put(n, 1);
            }
        }

        for (var entry : counter.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        SingleNumber exercise = new SingleNumber();
        int result = exercise.singleNumber(nums);
        System.out.println(result);
    }
}
