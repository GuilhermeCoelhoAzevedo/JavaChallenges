package leetCode;

public class CountStrings {
    public static int countNumberOfSubstringOccurrences(String value, String substring) {
        var count = 0;
        var currentIndex = value.indexOf(substring, 0);

        while (currentIndex != -1){
            count +=1;
            currentIndex = value.indexOf(substring, currentIndex + substring.length());
        }

        return count;
    }

    public static void main(String[] args) {
        String value = "abcabc";
        String substring = "abc";
        int numOccurrences = CountStrings.countNumberOfSubstringOccurrences(value, substring);
        System.out.println("Substring occurs " + numOccurrences + " times in this string");
    }
}
