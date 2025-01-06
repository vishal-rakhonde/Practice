import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMedian {
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

        Collections.sort(list);

        double median;
        if (n % 2 == 1) {
            median = list.get(n / 2);
        } else {
            median = (list.get((n / 2) - 1) + list.get(n / 2)) / 2.0;
        }

        System.out.println("Sorted LinkedList: " + list);
        System.out.println("Median: " + median);

        sc.close();
    }
}