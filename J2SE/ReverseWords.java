//How to reverse the words in a given String sentence?


public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence = "Hello world! This is a reverse words program.";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }
}
