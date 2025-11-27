package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/subarray-sum-equals-k?list=neetcode250

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    result+=1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //int[] nums = {2,-1,1,2};
        //int k = 2;
        int[] nums = {4,4,4,4,4,4};
        int k = 4;

        int result = SubarraySumEqualsK.subarraySum(nums, k);
        System.out.println(result);
    }

}
