package arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //Run first word from end to beggining
        for (int i = strs[0].length(); i > 0; i--){
            String prefix = strs[0].substring(0, i);
            Boolean containsPrefix = true;

            //Checks if current prefix exists in all other words
            for(int j = 1; j < strs.length; j++) {
                String word = strs[j].substring(0, prefix.length() > strs[j].length() ? strs[j].length() : prefix.length());

                if (!word.contains(prefix)){
                    containsPrefix = false;
                    break;
                }
            }

            if(containsPrefix){
                return prefix;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"c","acc","ccc"};
        LongestCommonPrefix execution = new LongestCommonPrefix();
        String result = execution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
