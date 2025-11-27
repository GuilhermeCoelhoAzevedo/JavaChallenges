package neetCode250.TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr){
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        boolean result = ValidPalindrome.isPalindrome(s);
        System.out.println(result);
    }
}
