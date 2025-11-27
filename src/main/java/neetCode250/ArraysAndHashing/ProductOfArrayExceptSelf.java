package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/products-of-array-discluding-self?list=neetcode250

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int product = 1;

            for (int j = 0; j < nums.length; j++){
                if (i != j){
                    product *= nums[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
