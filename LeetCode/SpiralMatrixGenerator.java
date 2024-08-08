/* Spiral Matrix III

You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and the southeast corner is at the last row and column.

You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.

Return an array of coordinates representing the positions of the grid in the order you visited them.

 

Example 1:
Input: rows = 1, cols = 4, rStart = 0, cStart = 0
Output: [[0,0],[0,1],[0,2],[0,3]]

Example 2:
Input: rows = 5, cols = 6, rStart = 1, cStart = 4
Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
 

Constraints:

1 <= rows, cols <= 100
0 <= rStart < rows
0 <= cStart < cols
*/
class SpiralMatrixGenerator {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // East, South, West, North
        int[][] result = new int[rows * cols][2];
        int steps = 1, d = 0, count = 0;
        
        result[count++] = new int[]{rStart, cStart};
        
        while (count < rows * cols) {
            for (int i = 0; i < steps; i++) {
                rStart += directions[d][0];
                cStart += directions[d][1];
                
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[count++] = new int[]{rStart, cStart};
                }
            }
            
            d = (d + 1) % 4;
            
            if (d == 0 || d == 2) steps++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        SpiralMatrixGenerator generator = new SpiralMatrixGenerator();
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;

        int[][] result = generator.spiralMatrixIII(rows, cols, rStart, cStart);

        for (int[] point : result) {
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }
}
