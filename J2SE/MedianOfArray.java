import java.util.Arrays;
import java.util.Scanner;

public class MedianOfArray {

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        if (length % 2 != 0) {
            return arr[length / 2];
        } else {
            return (arr[(length / 2) - 1] + arr[length / 2]) / 2.0;
        }
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
        
        System.out.println("Median of the array: " + findMedian(arr));
        sc.close();
    }
}
