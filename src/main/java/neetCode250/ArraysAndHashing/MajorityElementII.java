package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/majority-element-ii?list=neetcode250

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        double target = (double) nums.length / 3;

        for (int v : nums){
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()){
            if(entry.getValue() > target){
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,2,2,2,2,5,5,5};
        //int[] nums = {1,2,3};
        List<Integer> result = MajorityElementII.majorityElement(nums);
        System.out.println(result);
    }
}
