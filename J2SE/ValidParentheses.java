//How do you check if a given string contains valid parentheses?

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        String testString1 = "{[()]}";
        String testString2 = "{[(])}";
        String testString3 = "()[]{}";
        
        System.out.println(isValid(testString1));
        System.out.println(isValid(testString2));
        System.out.println(isValid(testString3));
    }
}
