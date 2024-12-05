import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' as the reference
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements to push onto the stack: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Stack after pushing elements: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Top element: " + stack.peek());

            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            System.out.println("Stack after popping an element: " + stack);
        } else {
            System.out.println("Stack is empty.");
        }

        System.out.println("Is stack empty? " + stack.isEmpty());
        sc.close();
    }
}
