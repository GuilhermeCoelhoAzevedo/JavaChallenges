package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;    // just add one
                return digits;  // done
            }
            digits[i] = 0;      // set to 0 and carry over
        }

        // If all were 9 (e.g., 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {6,3,9};
        PlusOne exercise = new PlusOne();
        int[] results = exercise.plusOne(digits);
        System.out.println(Arrays.toString(results));
    }
}
