package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/duplicate-integer?list=neetcode250

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int n : nums){
            if (seen.contains(n)){
                return true;
            }

            seen.add(n);
        }

        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,4};
        boolean result = ContainsDuplicate.hasDuplicate(nums);
        System.out.println(result);
    }
}
