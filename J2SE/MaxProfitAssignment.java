/*
Q. Most Profit Assigning Work

You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:

difficulty[i] and profit[i] are the difficulty and the profit of the ith job, and
worker[j] is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty at most worker[j]).
Every worker can be assigned at most one job, but one job can be completed multiple times.

For example, if three workers attempt the same job that pays $1, then the total profit will be $3. If a worker cannot complete any job, their profit is $0.
Return the maximum profit we can achieve after assigning the workers to the jobs.

Example 1:

Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.
Example 2:

Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
Output: 0
 

Constraints:

n == difficulty.length
n == profit.length
m == worker.length
1 <= n, m <= 104
1 <= difficulty[i], profit[i], worker[i] <= 105
*/

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> infos = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            infos.add(new int[]{difficulty[i], profit[i]});
        }
        infos.sort((a, b) -> a[0] - b[0]);
        
        List<int[]> maxProfitForDifficulty = new ArrayList<>();
        int maxp = 0;
        for (int[] info : infos) {
            int d = info[0], p = info[1];
            maxp = Math.max(maxp, p);
            maxProfitForDifficulty.add(new int[]{d, maxp});
        }
        
        int totalProfit = 0;
        for (int w : worker) {
            int ind = binarySearch(maxProfitForDifficulty, w);
            if (ind >= 0 && w >= maxProfitForDifficulty.get(ind)[0]) {
                totalProfit += maxProfitForDifficulty.get(ind)[1];
            }
        }
        return totalProfit;
    }
    
    private int binarySearch(List<int[]> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid)[0] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
