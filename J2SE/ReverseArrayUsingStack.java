import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Push elements of the array onto the stack
        for (int element : array) {
            stack.push(element);
        }

        // Pop elements from the stack back into the array
        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverseArray(array);

        System.out.println("\nReversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
