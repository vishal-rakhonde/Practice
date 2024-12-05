import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Numbers in the list:");
        System.out.println(numbers);

        System.out.println("Enter an index to fetch the number:");
        int index = sc.nextInt();
        if (index >= 0 && index < numbers.size()) {
            System.out.println("Number at index " + index + ": " + numbers.get(index));
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("Enter a number to check if it exists:");
        int numberToCheck = sc.nextInt();
        if (numbers.contains(numberToCheck)) {
            System.out.println(numberToCheck + " exists in the list.");
        } else {
            System.out.println(numberToCheck + " does not exist in the list.");
        }

        System.out.println("Sorting the list...");
        numbers.sort(Integer::compareTo);
        System.out.println("Sorted numbers: " + numbers);

        System.out.println("Removing even numbers...");
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("List after removing even numbers: " + numbers);

        System.out.println("Clearing the list...");
        numbers.clear();
        System.out.println("Is the list empty? " + numbers.isEmpty());

        sc.close();
    }
}
