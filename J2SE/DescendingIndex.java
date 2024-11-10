import java.util.Scanner;
public class DescendingIndex {
    
    public static int findDescendingIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = findDescendingIndex(arr);
        if (index != -1) {
            System.out.println("Array starts descending from index: " + index);
        } else {
            System.out.println("Array is not descending at any index.");
        }
		sc.close();
    }
}
