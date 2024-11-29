import java.util.Scanner;

public class OpenLockers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of lockers
        System.out.print("Enter the number of lockers: ");
        int n = sc.nextInt();

        // Print the lockers that remain open
        System.out.println("Lockers that remain open:");
        
        // Iterate through numbers to find perfect squares
        for (int i = 1; i * i <= n; i++) {
            // Print the square of the number (perfect square lockers remain open)
            System.out.print((i * i) + " ");
        }
    }
}
