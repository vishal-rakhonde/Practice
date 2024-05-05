import java.util.Arrays;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0}; // Example array
        sortZeroesAndOnes(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Method to sort an array of 0s and 1s
    public static void sortZeroesAndOnes(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int countOfZeros = 0;

        // Count the number of zeros
        for (int num : arr) {
            if (num == 0) {
                countOfZeros++;
            }
        }

        // Place zeros in the beginning of the array
        for (int i = 0; i < countOfZeros; i++) {
            arr[i] = 0;
        }

        // Place ones after zeros
        for (int i = countOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
