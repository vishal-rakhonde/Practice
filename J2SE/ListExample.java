import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of fruits:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the names of the fruits:");
        for (int i = 0; i < n; i++) {
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }

        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Enter the name of the fruit to remove:");
        String fruitToRemove = sc.nextLine();
        fruits.remove(fruitToRemove);

        System.out.println("After removal: " + fruits);
        sc.close();
    }
}