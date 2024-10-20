class Solution {
    public int minGroups(int[][] intervals) {
        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;
        for (int[] d : intervals) {
            minStart = Math.min(minStart, d[0]);
            maxEnd = Math.max(maxEnd, d[1]);
        }

        int[] arr = new int[maxEnd + 2];
        int ans = 0;

        for (int[] d : intervals) {
            arr[d[0]]++;
            arr[d[1] + 1]--;
        }

        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
