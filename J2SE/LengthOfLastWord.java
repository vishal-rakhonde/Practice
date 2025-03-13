public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + result);
    }
}