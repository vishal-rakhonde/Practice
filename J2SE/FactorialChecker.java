import java.util.Scanner;

public class FactorialChecker {
    public static int findFactorialOf(int num) {
        if (num <= 0) return -1;
        
        int i = 1;
        
        while (num > 1) {
            i++;
            if (num % i != 0) return -1;
            num /= i;
        }
        
        return num == 1 ? i : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int result = findFactorialOf(number);
        
        if (result != -1) {
            System.out.println(number + " is the factorial of " + result);
        } else {
            System.out.println(number + " is not a factorial of any integer.");
        }
        
        sc.close();
    }
}