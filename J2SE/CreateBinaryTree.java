/* Create Binary Tree From Descriptions

You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti] indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,

If isLefti == 1, then childi is the left child of parenti.
If isLefti == 0, then childi is the right child of parenti.
Construct the binary tree described by descriptions and return its root.

The test cases will be generated such that the binary tree is valid.

Example 1:

Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
Output: [50,20,80,15,17,19]
Explanation: The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.
Example 2:


Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
Output: [1,2,null,null,3,4]
Explanation: The root node is the node with value 1 since it has no parent.
The resulting binary tree is shown in the diagram.
 

Constraints:

1 <= descriptions.length <= 104
descriptions[i].length == 3
1 <= parenti, childi <= 105
0 <= isLefti <= 1
The binary tree described by descriptions is valid.
*/

import java.util.*;

// Definition for a binary tree node
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

public class CreateBinaryTree {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        
        // Build the tree using the descriptions
        for (int[] arr : descriptions) {
            int parent = arr[0], child = arr[1], isLeft = arr[2];
            children.add(child);
            TreeNode node = map.getOrDefault(parent, new TreeNode(parent));
            if (isLeft == 1) {
                node.left = map.getOrDefault(child, new TreeNode(child));
                map.put(child, node.left);
            } else {
                node.right = map.getOrDefault(child, new TreeNode(child));
                map.put(child, node.right);
            }
            map.put(parent, node);
        }
        
        // Find the root node
        int root = -1;
        for (int[] arr : descriptions) {
            if (!children.contains(arr[0])) {
                root = arr[0];
                break;
            }
        }
        
        // Return the root node
        return map.getOrDefault(root, null);
    }
    
    public static void main(String[] args) {
        CreateBinaryTree treeCreator = new CreateBinaryTree();
        
        // Example usage
        int[][] descriptions = {
            {1, 2, 1}, // parent=1, child=2, left child
            {1, 3, 0}, // parent=1, child=3, right child
            {2, 4, 1}, // parent=2, child=4, left child
            {2, 5, 0}  // parent=2, child=5, right child
        };
        
        TreeNode root = treeCreator.createBinaryTree(descriptions);
        
        // Print the tree (in-order traversal for simplicity)
        System.out.println("In-order traversal:");
        printInOrder(root);
    }
    
    // Helper method to print in-order traversal of the tree
    private static void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }
}
