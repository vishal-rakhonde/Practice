import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {
                result.append(c);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}
