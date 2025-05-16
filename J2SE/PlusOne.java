import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits of the number (space-separated):");
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int[] digits = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            digits[i] = Integer.parseInt(inputArray[i]);
        }

        int[] result = plusOne(digits);

        System.out.print("Result after adding one: ");
        printArray(result);

        sc.close();
    }
}

