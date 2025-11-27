package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/remove-element?list=neetcode250

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        nums = Arrays.stream(nums).filter(v -> v != val).toArray();
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        int val = 5;

        int count = RemoveElement.removeElement(nums, val);
        System.out.println(count);
    }
}
