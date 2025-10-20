package string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length -1].length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        LengthOfLastWord exercise = new LengthOfLastWord();
        Integer result = exercise.lengthOfLastWord(s);
        System.out.println(result);
    }
}
