/* Most Stones Removed with Same Row or Column
Solved
Medium
Topics
Companies
On a 2D plane, we place n stones at some integer coordinate points. Each coordinate point may have at most one stone.

A stone can be removed if it shares either the same row or the same column as another stone that has not been removed.

Given an array stones of length n where stones[i] = [xi, yi] represents the location of the ith stone, return the largest possible number of stones that can be removed.

 

Example 1:
Input: stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]

Output: 5
Explanation: One way to remove 5 stones is as follows:
1. Remove stone [2,2] because it shares the same row as [2,1].
2. Remove stone [2,1] because it shares the same column as [0,1].
3. Remove stone [1,2] because it shares the same row as [1,0].
4. Remove stone [1,0] because it shares the same column as [0,0].
5. Remove stone [0,1] because it shares the same row as [0,0].
Stone [0,0] cannot be removed since it does not share a row/column with another stone still on the plane.

Example 2:
Input: stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]

Output: 3
Explanation: One way to make 3 moves is as follows:
1. Remove stone [2,2] because it shares the same row as [2,0].
2. Remove stone [2,0] because it shares the same column as [0,0].
3. Remove stone [0,2] because it shares the same row as [0,0].
Stones [0,0] and [1,1] cannot be removed since they do not share a row/column with another stone still on the plane.
Example 3:

Input: stones = [[0,0]]
Output: 0
Explanation: [0,0] is the only stone on the plane, so you cannot remove it.
 

Constraints:

1 <= stones.length <= 1000
0 <= xi, yi <= 104
No two stones are at the same coordinate point.
*/
import java.util.HashSet;
import java.util.Set;

class StoneRemovalSolver {

    public int removeStones(int[][] stones) {
        int[] parent = new int[20001];
        int[] rank = new int[20001];
        for (int i = 0; i <= 20000; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        for (int[] stone : stones) {
            int x = stone[0];
            int y = stone[1] + 10001;
            union(parent, rank, x, y);
        }

        Set<Integer> uniqueParents = new HashSet<>();
        for (int[] stone : stones) {
            uniqueParents.add(findParent(parent, stone[0]));
        }

        return stones.length - uniqueParents.size();
    }

    void union(int[] parent, int[] rank, int x, int y) {
        int parX = findParent(parent, x);
        int parY = findParent(parent, y);
        if (parX != parY) {
            if (rank[parX] > rank[parY]) {
                parent[parY] = parX;
            } else if (rank[parX] < rank[parY]) {
                parent[parX] = parY;
            } else {
                parent[parY] = parX;
                rank[parX]++;
            }
        }
    }

    int findParent(int[] parent, int ind) {
        if (parent[ind] != ind) {
            parent[ind] = findParent(parent, parent[ind]);  // Path compression
        }
        return parent[ind];
    }
}

public class Main {
    public static void main(String[] args) {
        StoneRemovalSolver solver = new StoneRemovalSolver();

        int[][] stones = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 2},
            {2, 1},
            {2, 2}
        };

        int result = solver.removeStones(stones);
        System.out.println("Maximum number of stones that can be removed: " + result);
    }
}
