/* Number of Good Leaf Nodes Pairs

You are given the root of a binary tree and an integer distance. A pair of two different leaf nodes of a binary tree is said to be good if the length of the shortest path between them is less than or equal to distance.

Return the number of good leaf node pairs in the tree.

Example 1:
Input: root = [1,2,3,null,4], distance = 3
Output: 1
Explanation: The leaf nodes of the tree are 3 and 4 and the length of the shortest path between them is 3. This is the only good pair.

Example 2:
Input: root = [1,2,3,4,5,6,7], distance = 3
Output: 2
Explanation: The good pairs are [4,5] and [6,7] with shortest path = 2. The pair [4,6] is not good because the length of ther shortest path between them is 4.

Example 3:
Input: root = [7,1,4,6,null,5,3,null,null,null,null,null,2], distance = 3
Output: 1
Explanation: The only good pair is [2,5].
 

Constraints:
The number of nodes in the tree is in the range [1, 210].
1 <= Node.val <= 100
1 <= distance <= 10

*/

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class GoodLeafPairsCounter {
    private int numOfGoodLeafPairs;

    private List<Integer> dfs(TreeNode node, int distance) {
        if (node == null) return new ArrayList<>();
        if (node.left == null && node.right == null) return Arrays.asList(1);

        List<Integer> leftList = dfs(node.left, distance);
        List<Integer> rightList = dfs(node.right, distance);

        for (int lv : leftList) {
            for (int rv : rightList) {
                if (lv + rv <= distance) numOfGoodLeafPairs++;
            }
        }

        List<Integer> parentList = new ArrayList<>();
        for (int lv : leftList) {
            if (lv + 1 <= distance) parentList.add(lv + 1);
        }

        for (int rv : rightList) {
            if (rv + 1 <= distance) parentList.add(rv + 1);
        }

        return parentList;
    }

    public int countPairs(TreeNode root, int distance) {
        numOfGoodLeafPairs = 0;
        dfs(root, distance);
        return numOfGoodLeafPairs;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        GoodLeafPairsCounter counter = new GoodLeafPairsCounter();
        int distance = 3;
        int result = counter.countPairs(root, distance);
        System.out.println("Number of good leaf pairs: " + result);
    }
}
