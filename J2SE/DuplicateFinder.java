import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("apple", "banana", "orange", "apple", "banana", "grape");

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
