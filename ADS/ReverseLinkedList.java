import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the LinkedList:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        System.out.println("Original LinkedList: " + list);
        Collections.reverse(list);
        System.out.println("Reversed LinkedList: " + list);

        sc.close();
    }
}