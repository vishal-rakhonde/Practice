class Solution {
    public int maximumSwap(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        int n = nums.length;
        
        // Store the last occurrence of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[nums[i] - '0'] = i;
        }

        // Traverse the digits and find the first digit to swap
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > nums[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap the digits
                    char temp = nums[i];
                    nums[i] = nums[last[d]];
                    nums[last[d]] = temp;
                    // Return the result as soon as we swap
                    return Integer.parseInt(new String(nums));
                }
            }
        }
        
        return num; // Return original number if no swap
    }
}