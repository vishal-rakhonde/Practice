import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitManager {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of fruits:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the names of the fruits:");
        for (int i = 0; i < n; i++) {
            fruits.add(sc.nextLine());
        }

        System.out.println("Fruits in the list:");
        System.out.println(fruits);

        System.out.println("Enter a fruit to replace:");
        String oldFruit = sc.nextLine();
        System.out.println("Enter the new fruit name:");
        String newFruit = sc.nextLine();
        if (fruits.contains(oldFruit)) {
            fruits.set(fruits.indexOf(oldFruit), newFruit);
            System.out.println("Updated list: " + fruits);
        } else {
            System.out.println(oldFruit + " not found in the list.");
        }

        System.out.println("Enter the name of a fruit to remove:");
        String fruitToRemove = sc.nextLine();
        fruits.remove(fruitToRemove);
        System.out.println("List after removal: " + fruits);

        System.out.println("Reversing the list...");
        List<String> reversedFruits = new ArrayList<>();
        for (int i = fruits.size() - 1; i >= 0; i--) {
            reversedFruits.add(fruits.get(i));
        }
        System.out.println("Reversed list: " + reversedFruits);

        sc.close();
    }
}
