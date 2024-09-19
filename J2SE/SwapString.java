import java.util.Scanner;

class SwapString {
    public static void swap(String str1, String str2) {
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string (str1): ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string (str2): ");
        String str2 = sc.nextLine();

        swap(str1, str2);

        sc.close();
    }
}
