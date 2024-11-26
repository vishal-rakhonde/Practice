import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> elements = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements.add(sc.nextLine());
        }

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String element : elements) {
            if (!seen.add(element)) {
                duplicates.add(element);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
