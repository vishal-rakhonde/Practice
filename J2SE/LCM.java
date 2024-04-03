/*Write a java program to LCM of TWO given number.*/
import java.util.Scanner;

class LCM {
   
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}
