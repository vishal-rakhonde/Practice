import java.util.*;

class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("Enter the number of elements to push:");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        
        System.out.println("Stack: " + stack);
        
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped Element: " + poppedElement);
            System.out.println("Stack after pop: " + stack);
        }
        
        if (!stack.isEmpty()) {
            int topElement = stack.peek();
            System.out.println("Top Element: " + topElement);
        }
        
        System.out.println("Is stack empty? " + stack.isEmpty());
        
        sc.close();
    }
}
