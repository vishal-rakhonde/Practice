import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            stack.push(element);
        }

        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

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