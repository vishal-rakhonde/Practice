import java.util.Stack;

public class StringReverser {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String original = "HelloWorld";
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reverseString(original));
    }
}
