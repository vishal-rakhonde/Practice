import java.util.Scanner;

public class SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; // The insertion position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target value
        int target = sc.nextInt();

        // Output the result
        System.out.println(searchInsertPosition(nums, target));
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
