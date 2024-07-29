/* Count Number of Teams

There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

You have to form a team of 3 soldiers amongst them under the following rules:

Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

 

Example 1:
Input: rating = [2,5,3,4,1]
Output: 3
Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 

Example 2:
Input: rating = [2,1,3]
Output: 0
Explanation: We can't form any team given the conditions.

Example 3:
Input: rating = [1,2,3,4]
Output: 4
 

Constraints:

n == rating.length
3 <= n <= 1000
1 <= rating[i] <= 105
All the integers in rating are unique.
*/

import java.util.Arrays;

class TeamFormation {
    private int countSequences(int n, int prevIdx, int currIdx, int cnt, int[] rating, int[][][] memo, boolean isIncreasing) {
        if (cnt == 3) return 1;
        if (currIdx == n) return 0;

        if (memo[prevIdx + 1][currIdx][cnt] != -1) return memo[prevIdx + 1][currIdx][cnt];

        int take = 0;
        if (prevIdx == -1 || (isIncreasing ? rating[currIdx] > rating[prevIdx] : rating[currIdx] < rating[prevIdx])) {
            take = countSequences(n, currIdx, currIdx + 1, cnt + 1, rating, memo, isIncreasing);
        }
        int notTake = countSequences(n, prevIdx, currIdx + 1, cnt, rating, memo, isIncreasing);
        return memo[prevIdx + 1][currIdx][cnt] = take + notTake;
    }

    public int numTeams(int[] rating) {
        int n = rating.length;
        int[][][] memo = new int[n + 1][n + 1][4];
        for (int[][] plane : memo) {
            for (int[] row : plane) {
                Arrays.fill(row, -1);
            }
        }
        int res = countSequences(n, -1, 0, 0, rating, memo, true);
        for (int[][] plane : memo) {
            for (int[] row : plane) {
                Arrays.fill(row, -1);
            }
        }
        return res + countSequences(n, -1, 0, 0, rating, memo, false);
    }

    public static void main(String[] args) {
        TeamFormation solution = new TeamFormation();
        int[] rating = {2, 5, 3, 4, 1};
        int result = solution.numTeams(rating);
        System.out.println("Number of valid teams: " + result); // Expected output: 3
    }
}
