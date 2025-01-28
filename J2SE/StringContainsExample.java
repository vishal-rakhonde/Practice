import java.util.Scanner;

public class StringContainsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the substring to check: ");
        String substring = sc.nextLine();
        
        boolean contains = str.contains(substring);
        System.out.println("Does the string contain '" + substring + "'? " + contains);
        
        sc.close();
    }
}
