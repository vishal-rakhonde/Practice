class Solution {
    public int findKthNumber(int n, int k) {
        int currentPrefix = 1;
        k--;

        while (k > 0) {
            int count = countNumbersWithPrefix(currentPrefix, n);
            if (k >= count) {
                currentPrefix++;
                k -= count;
            } else {
                currentPrefix *= 10;
                k--;
            }
        }

        return currentPrefix;
    }

    private int countNumbersWithPrefix(int prefix, int n) {
        int totalCount = 0;
        long first = prefix, next = prefix + 1;

        while (first <= n) {
            totalCount += Math.min(n + 1L, next) - first;
            first *= 10;
            next *= 10;
        }

        return totalCount;
    }
}
