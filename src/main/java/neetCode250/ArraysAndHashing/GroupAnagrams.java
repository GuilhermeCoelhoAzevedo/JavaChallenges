package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/anagram-groups?list=neetcode250

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> subLists = new HashMap<>();

        for (String s : strs){
            char[] aux = s.toCharArray();
            Arrays.sort(aux);
            String sortedStr = new String(aux);

            subLists.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(subLists.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        //String[] strs = {"x"};
        //String[] strs = {""};
        List<List<String>> result = GroupAnagrams.groupAnagrams(strs);
        System.out.println(result);
    }
}
