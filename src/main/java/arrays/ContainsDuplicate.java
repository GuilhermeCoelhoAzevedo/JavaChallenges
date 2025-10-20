package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();

        for (int n : nums){
            if(hash.contains(n)){
                return true;
            }

            hash.add(n);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        var containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.hasDuplicate(nums));
    }
}
