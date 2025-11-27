package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/longest-common-prefix?list=neetcode250

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";

        //Looping letters of the first String
        for (int i = 0; i < strs[0].length(); i++){
            char letter = strs[0].charAt(i);

            //Looping through string list
            for (int j = 1; j < strs.length; j++){
                String str = strs[j];

                if (i >= str.length() || str.charAt(i) != letter){
                    return prefix;
                }
            }

            prefix += letter;
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"dance","dag","danger","damage"};
        String prefix = LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
