class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currentSum = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1);

            // Shrink the window if it exceeds size k
            if (right - left + 1 > k) {
                int leftNum = nums[left];
                currentSum -= leftNum;
                frequencyMap.put(leftNum, frequencyMap.get(leftNum) - 1);
                if (frequencyMap.get(leftNum) == 0) {
                    frequencyMap.remove(leftNum);
                }
                left++;
            }

            // Check for valid subarray with all unique elements
            if (frequencyMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
