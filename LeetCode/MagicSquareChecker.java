/* Magic Squares In Grid

A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?

Note: while a magic square can only contain numbers from 1 to 9, grid may contain numbers up to 15.

 

Example 1:


Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
Output: 1
Explanation: 
The following subgrid is a 3 x 3 magic square:

while this one is not:

In total, there is only one magic square inside the given grid.
Example 2:

Input: grid = [[8]]
Output: 0
 

Constraints:

row == grid.length
col == grid[i].length
1 <= row, col <= 10
0 <= grid[i][j] <= 15

*/
import java.util.Scanner;

class MagicSquareChecker {
    int ans = 0;

    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if (n < 3 || m < 3)
            return 0;

        for (int i = 0; i <= n - 3; i++)
            for (int j = 0; j <= n - 3; j++)
                help(i, j, grid);

        return ans;
    }

    public void help(int x, int y, int[][] mat) {
        int[] sum = new int[3];
        int[] sumcol = new int[3];
        boolean[] arr = new boolean[10];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                sum[i] += mat[x + i][y + j];
                sumcol[j] += mat[x + i][y + j];

                if (mat[x + i][y + j] > 9 || mat[x + i][y + j] == 0 || arr[mat[x + i][y + j]])
                    return;
                arr[mat[x + i][y + j]] = true;
            }

        for (int i = 1; i < 3; i++)
            if (sum[i] != sum[i - 1] || sum[i] != sumcol[i] || sumcol[i] != sumcol[i - 1])
                return;

        int dig = mat[x][y] + mat[x + 1][y + 1] + mat[x + 2][y + 2];

        if (dig != (mat[x][y + 2] + mat[x + 1][y + 1] + mat[x + 2][y]) || dig != sum[0])
            return;

        ans++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the grid:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] grid = new int[n][m];
        System.out.println("Enter the elements of the grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        MagicSquareChecker checker = new MagicSquareChecker();
        System.out.println("Number of magic squares: " + checker.numMagicSquaresInside(grid));
    }
}
