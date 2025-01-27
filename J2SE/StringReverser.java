import java.util.Stack;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = sc.nextLine();
        System.out.println("Reversed String: " + reverseString(original));
        sc.close();
    }
}