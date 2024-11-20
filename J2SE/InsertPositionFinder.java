import java.util.*;

class InsertPositionFinder {
    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums1 = new int[n];
            for (int i = 0; i < n; i++) {
                nums1[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            System.out.println(searchInsertPosition(nums1, key));
        }
    }
}
