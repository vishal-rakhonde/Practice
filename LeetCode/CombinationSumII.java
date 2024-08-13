/* Combination Sum II

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
*/
import java.util.*;

public class CombinationSumII {
    private void backtrack(int idx, int[] candidates, int target, List<List<Integer>> results, List<Integer> combination) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates
            }

            combination.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], results, combination);
            combination.remove(combination.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, results, new ArrayList<>());
        return results;
    }

    public static void main(String[] args) {
        CombinationSumII solver = new CombinationSumII();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = solver.combinationSum2(candidates, target);
        System.out.println("Combinations that sum up to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
