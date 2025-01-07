import java.util.LinkedList;
import java.util.Scanner;

public class AddNodeAtTarget {
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

        System.out.println("Enter the value of the new node to add:");
        int newNode = sc.nextInt();

        System.out.println("Enter the target index where you want to insert the new node:");
        int targetIndex = sc.nextInt();

        if (targetIndex >= 0 && targetIndex <= list.size()) {
            list.add(targetIndex, newNode);
            System.out.println("Updated LinkedList: " + list);
        } else {
            System.out.println("Invalid target index. Please enter an index between 0 and " + list.size());
        }

        sc.close();
    }
}