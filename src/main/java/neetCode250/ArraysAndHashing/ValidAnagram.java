package neetCode250.ArraysAndHashing;

import java.util.Arrays;

//https://neetcode.io/problems/is-anagram?list=neetcode250

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        boolean result = ValidAnagram.isAnagram(s, t);
        System.out.println(result);
    }
}
