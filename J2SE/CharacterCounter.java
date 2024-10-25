import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = countCharacters(input);
        System.out.println("Number of characters: " + count);
    }

    public static int countCharacters(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            count++;
        }
        return count;
    }
}
