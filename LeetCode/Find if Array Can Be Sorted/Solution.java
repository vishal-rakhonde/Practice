class Solution {
    public boolean canSortArray(int[] nums) {
        int previousMax = Integer.MIN_VALUE;
        int currentMax = nums[0];
        int currentMin = nums[0];
        int currentSetBits = Integer.bitCount(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int setBitsCount = Integer.bitCount(nums[i]);

            if (currentSetBits == setBitsCount) {
                currentMax = Math.max(currentMax, nums[i]);
                currentMin = Math.min(currentMin, nums[i]);
            } else {
                if (currentMin < previousMax) {
                    return false;
                }
                previousMax = currentMax;
                currentSetBits = setBitsCount;
                currentMin = nums[i];
                currentMax = nums[i];
            }
        }
        return currentMin > previousMax;
    }
}
