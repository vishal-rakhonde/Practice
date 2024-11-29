import java.util.Scanner;

public class OpenLockers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lockers: ");
        int n = sc.nextInt();
        
        System.out.println("Lockers that remain open:");
        for (int i = 1; i * i <= n; i++) {
            System.out.print((i * i) + " ");
        }
    }
}
