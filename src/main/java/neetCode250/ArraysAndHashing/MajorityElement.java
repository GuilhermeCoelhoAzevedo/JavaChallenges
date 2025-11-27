package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/majority-element?list=neetcode250

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int element = 0, maxValue = 0;

        for (int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);

            if (count.get(n) > maxValue){
                element = n;
                maxValue = count.get(n);
            }
        }

        return element;
    }

    public static void main(String[] args) {
        int[] nums = {5,5,1,1,1,1,5};
        int result = MajorityElement.majorityElement(nums);
        System.out.println(result);
    }
}
