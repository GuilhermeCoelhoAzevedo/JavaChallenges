package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/concatenation-of-array?list=neetcode250

import java.util.Arrays;

public class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++){
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {22,21,20,1};
        int[] result = ArrayConcatenation.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
