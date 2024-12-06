import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println("Original String: " + input);
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
