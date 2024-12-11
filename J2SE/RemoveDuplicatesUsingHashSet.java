import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
    public static void main(String[] args) {
        String input = "programming";
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
