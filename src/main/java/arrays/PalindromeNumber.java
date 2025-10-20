package arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        var s = String.valueOf(x);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        var palindrome = new PalindromeNumber();
        System.out.println(palindrome.isPalindrome(122));
    }
}
