package arrays;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();

        for (var c : s.toLowerCase().toCharArray()){
           if (Character.isLetterOrDigit(c)){
                result.append(c);
            }
        }

        return result.toString().equals(result.reverse().toString());
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        ValidPalindrome exercise = new ValidPalindrome();
        boolean result = exercise.isPalindrome(s);
        System.out.println(result);
    }
}
