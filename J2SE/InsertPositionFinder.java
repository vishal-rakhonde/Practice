import java.util.*;
class InsertPositionFinder {
    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums1 = Arrays.stream(new int[n]).map(i -> sc.nextInt()).toArray();
            int key = sc.nextInt();
            System.out.println(searchInsertPosition(nums1, key));
        }
    }
}
