/* Delete Nodes And Return Forest

Given the root of a binary tree, each node in the tree has a distinct value.

After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).

Return the roots of the trees in the remaining forest. You may return the result in any order.

 

Example 1:
Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]
Example 2:

Input: root = [1,2,4,null,3], to_delete = [3]
Output: [[1,2,4]]
 

Constraints:

The number of nodes in the given tree is at most 1000.
Each node has a distinct value between 1 and 1000.
to_delete.length <= 1000
to_delete contains distinct values between 1 and 1000.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinaryTreeDeletion {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> valsToDelete = new HashSet<>();
        List<TreeNode> result = new ArrayList<>();

        for (int number : to_delete)
            valsToDelete.add(number);

        if (root != null && !valsToDelete.contains(root.val))
            result.add(root);
        shouldDelete(result, valsToDelete, root);
        return result;
    }

    public TreeNode shouldDelete(List<TreeNode> result, Set<Integer> valsToDelete, TreeNode root) {
        if (root == null)
            return null;

        root.left = shouldDelete(result, valsToDelete, root.left);
        root.right = shouldDelete(result, valsToDelete, root.right);

        if (valsToDelete.contains(root.val)) {
            if (root.left != null) 
                result.add(root.left);
            if (root.right != null)
                result.add(root.right);
            return null;
        }
        return root;
    }

    public static void main(String[] args) {
        // Example to test the delNodes function
        BinaryTreeDeletion solution = new BinaryTreeDeletion();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int[] to_delete = {3, 5};

        List<TreeNode> result = solution.delNodes(root, to_delete);

        // Printing the roots of the resulting trees
        for (TreeNode node : result) {
            System.out.println("Tree Root: " + node.val);
        }
    }
}
