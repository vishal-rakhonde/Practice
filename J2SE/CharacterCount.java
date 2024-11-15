import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int characterCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {  // Ignore spaces
                characterCount++;
            }
        }
        
        System.out.println("Number of characters (excluding spaces): " + characterCount);
        
        sc.close();
    }
}
