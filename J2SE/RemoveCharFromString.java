public class RemoveCharFromString {
    public static String removeCharacter(String str, char c) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != c) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello World";
        char charToRemove = 'o';
        
        String result = removeCharacter(inputString, charToRemove);
        System.out.println("Original String: " + inputString);
        System.out.println("After removing '" + charToRemove + "': " + result);
    }
}
