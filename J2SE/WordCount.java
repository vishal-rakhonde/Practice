public class WordCount {
    public static int countWords(String input) {
        int count = 1; 
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "I am vishal rakhonde";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount); 
    }
}
