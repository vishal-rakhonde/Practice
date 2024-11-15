import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int characterCount = input.length();
        
        System.out.println("Number of characters: " + characterCount);
        
        scanner.close();
    }
}
