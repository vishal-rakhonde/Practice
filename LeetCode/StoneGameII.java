/* Stone Game II

Alice and Bob continue their games with piles of stones.  There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].  The objective of the game is to end with the most stones. 

Alice and Bob take turns, with Alice starting first.  Initially, M = 1.

On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M.  Then, we set M = max(M, X).

The game continues until all the stones have been taken.

Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.

 

Example 1:

Input: piles = [2,7,9,4,4]
Output: 10
Explanation:  If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again. Alice can get 2 + 4 + 4 = 10 piles in total. If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case, Alice get 2 + 7 = 9 piles in total. So we return 10 since it's larger. 
Example 2:

Input: piles = [1,2,3,4,5,100]
Output: 104
 

Constraints:

1 <= piles.length <= 100
1 <= piles[i] <= 104
*/

class StoneGameII {
    private Map<Integer, Integer> dp = new HashMap<>();

    private int score(int turn, int idx, int M, int[] piles) {
        if (idx >= piles.length) {
            return 0;
        }

        int key = (turn << 20) | (idx << 10) | M;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int res = (turn == 0) ? 0 : Integer.MAX_VALUE;
        int total = 0;

        for (int x = 1; x <= 2 * M; ++x) {
            if (idx + x > piles.length) {
                break;
            }
            total += piles[idx + x - 1];

            if (turn == 0) {
                res = Math.max(res, total + score(1, idx + x, Math.max(M, x), piles));
            } else {
                res = Math.min(res, score(0, idx + x, Math.max(M, x), piles));
            }
        }

        dp.put(key, res);
        return res;
    }

    public int stoneGameII(int[] piles) {
        return score(0, 0, 1, piles);
    }

    public static void main(String[] args) {
        StoneGameII solution = new StoneGameII();
        int[] piles = {2, 7, 9, 4, 4};  // Example input
        int result = solution.stoneGameII(piles);
        System.out.println("Maximum number of stones Alice can get: " + result);
    }
}
