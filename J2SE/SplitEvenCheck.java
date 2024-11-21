import java.util.Scanner;

public class SplitEvenCheck {
    public static String isSplitEven(int N) {
        if (N > 2 && N % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it can be split into two even integers:");
        int N = sc.nextInt(); // Take input from the user

        System.out.println("N = " + N + " -> " + isSplitEven(N));

        sc.close();
    }
}
