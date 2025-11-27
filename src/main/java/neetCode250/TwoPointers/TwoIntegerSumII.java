package neetCode250.TwoPointers;

import java.util.Arrays;

public class TwoIntegerSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] result = {0,0};

        while (l < r){
            if (numbers[l] + numbers[r] > target){
                r--;
                continue;
            } else if(numbers[l] + numbers[r] < target){
                l++;
                continue;
            } else {
                result[0] = l + 1;
                result[1] = r + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //int[] numbers = {1,2,3,4};
        //int target = 3;

        int[] numbers = {2,3,4};
        int target = 6;

        int[] result = TwoIntegerSumII.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
