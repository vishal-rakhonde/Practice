/* Regions Cut By Slashes

An n x n grid is composed of 1 x 1 squares where each 1 x 1 square consists of a '/', '\', or blank space ' '. These characters divide the square into contiguous regions.

Given the grid grid represented as a string array, return the number of regions.

Note that backslash characters are escaped, so a '\' is represented as '\\'.

 

Example 1:
Input: grid = [" /","/ "]

Output: 2

Example 2:
Input: grid = [" /","  "]

Output: 1

Example 3:
Input: grid = ["/\\","\\/"]

Output: 5

Explanation: Recall that because \ characters are escaped, "\\/" refers to \/, and "/\\" refers to /\.
 

Constraints:
n == grid.length == grid[i].length
1 <= n <= 30
grid[i][j] is either '/', '\', or ' '.
*/

class RegionsBySlashes {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = n * n * 4;
        UnionFind uf = new UnionFind(size);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int base = (i * n + j) * 4;
                char c = grid[i].charAt(j);

                switch (c) {
                    case '/':
                        uf.union(base, base + 3);
                        uf.union(base + 1, base + 2);
                        break;
                    case '\\':
                        uf.union(base, base + 1);
                        uf.union(base + 2, base + 3);
                        break;
                    default:
                        uf.union(base, base + 1);
                        uf.union(base + 1, base + 2);
                        uf.union(base + 2, base + 3);
                        break;
                }

                if (i < n - 1) {
                    uf.union(base + 2, base + 4 * n);
                }
                if (j < n - 1) {
                    uf.union(base + 1, base + 7);
                }
            }
        }

        return uf.getCount();
    }

    public static void main(String[] args) {
        RegionsBySlashes solution = new RegionsBySlashes();
        String[] grid = {
            " /",
            "/ "
        };
        int result = solution.regionsBySlashes(grid);
        System.out.println("Number of regions: " + result);
    }
}

class UnionFind {
    private final int[] parent;
    private final int[] rank;
    private int count;

    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];
        count = size;
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
