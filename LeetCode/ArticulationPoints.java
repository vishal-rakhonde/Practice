/* Minimum Number of Days to Disconnect Island

You are given an m x n binary grid grid where 1 represents land and 0 represents water. An island is a maximal 4-directionally (horizontal or vertical) connected group of 1's.

The grid is said to be connected if we have exactly one island, otherwise is said disconnected.

In one day, we are allowed to change any single land cell (1) into a water cell (0).

Return the minimum number of days to disconnect the grid.

 

Example 1:
Input: grid = [[0,1,1,0],[0,1,1,0],[0,0,0,0]]

Output: 2
Explanation: We need at least 2 days to get a disconnected grid.
Change land grid[1][1] and grid[0][2] to water and get 2 disconnected island.

Example 2:
Input: grid = [[1,1]]

Output: 2
Explanation: Grid of full water is also disconnected ([[1,1]] -> [[0,0]]), 0 islands.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 30
grid[i][j] is either 0 or 1
*/
public class ArticulationPoints {
    private int time;
    private int[][] vis;
    private int[][] low;
    private final int[] d = {0, 1, 0, -1, 0};
    private boolean arti;

    public int minDays(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        vis = new int[n][m];
        low = new int[n][m];
        time = 1;
        arti = false;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (found) return 0;
                    found = true;
                    art(i, j, grid, -1, -1);
                }
            }
        }

        if (time == 1) return 0;
        if (time == 2) return 1;
        return arti ? 1 : 2;
    }

    private void art(int row, int col, int[][] grid, int parRow, int parCol) {
        grid[row][col] = 0;
        vis[row][col] = time;
        low[row][col] = time++;
        int child = 0;

        for (int i = 0; i < 4; i++) {
            int x = d[i] + row;
            int y = d[i + 1] + col;

            if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) continue;
            if (x == parRow && y == parCol || grid[x][y] == 0) continue;

            if (vis[x][y] == 0) {
                child++;
                art(x, y, grid, row, col);
                low[row][col] = Math.min(low[row][col], low[x][y]);
                if (low[x][y] >= vis[row][col] && parRow != -1 && parCol != -1) {
                    arti = true;
                }
            } else {
                low[row][col] = Math.min(low[row][col], vis[x][y]);
            }
        }

        if (parRow == -1 && parCol == -1 && child > 1) {
            arti = true;
        }
    }

    public static void main(String[] args) {
        ArticulationPoints ap = new ArticulationPoints();
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };
        int result = ap.minDays(grid);
        System.out.println("Minimum days to disconnect the grid: " + result);
    }
}
