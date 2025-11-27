package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/two-integer-sum?list=neetcode250

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> d = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (d.containsKey(nums[i])){
                return new int[] {d.get(nums[i]), i};
            }

            d.put(target-nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6};
        int target = 10;

        int[] result = TwoSum.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
