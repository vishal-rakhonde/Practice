import java.util.Scanner;

public class ReverseStringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(original);
        String reversed = stringBuilder.reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }
}
