public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;
        
        for (int i = 0; i < length; i++) {
            char currentChar = chars[i];
            for (int j = i + 1; j < length; j++) {
                if (chars[j] == currentChar) {
                    for (int k = j; k < length - 1; k++) {
                        chars[k] = chars[k + 1];
                    }
                    length--;
                    j--;
                }
            }
        }
        
        return new String(chars, 0, length);
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}
