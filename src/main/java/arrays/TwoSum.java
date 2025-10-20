package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if (counter.containsKey(nums[i])) {
                return new int[]{counter.get(nums[i]), i};
            }

            counter.put(target - nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        var result = TwoSum.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}