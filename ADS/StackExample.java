import java.util.*;

class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack: " + stack);
        
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
        
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}