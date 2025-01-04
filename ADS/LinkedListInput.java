import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInput {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add to the LinkedList:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        System.out.println("LinkedList: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        sc.close();
    }
}
