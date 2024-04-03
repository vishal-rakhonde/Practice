/*Write a Java Program to find GCD of two given numbers. */
import java.util.Scanner;

public class GreatestCommonDivisor{
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);
        System.out.println("Greatest Common Divisor of " + num1 + " and " + num2 + " is: " + result);
    }
}
