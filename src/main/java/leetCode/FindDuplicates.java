package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> controller = new HashSet<>();

        for (var n : numbers){
            if (controller.contains(n)){
                result.add(n);
            } else {
                controller.add(n);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        var result = FindDuplicates.findDuplicates(numbers);
        System.out.println(result);
    }
}
