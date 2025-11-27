package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/longest-consecutive-sequence?list=neetcode250

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int longest = 1;
        int next_number = nums[0] + 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++){
            //Controlling duplicates
            if(nums[i] < next_number){
                continue;
            } else if (nums[i] == next_number){
                count +=1;
                next_number +=1;
            } else {
                longest = Math.max(longest, count);
                next_number = nums[i] + 1;
                count = 1;
            }
        }

        longest = Math.max(longest, count);

        return longest;
    }

    public static void main(String[] args) {
        //int[] nums = {0,3,2,5,4,6,1,1};
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int longest = LongestConsecutive.longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence: " + longest);
    }
}
