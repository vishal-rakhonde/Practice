import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeRecursive {
    TreeNode root;

    public void preorderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public TreeNode createTree(Scanner sc) {
        System.out.print("Enter node value (-1 for no node): ");
        int val = sc.nextInt();
        if (val == -1) return null;

        TreeNode node = new TreeNode(val);
        System.out.println("Enter left child of " + val);
        node.left = createTree(sc);
        System.out.println("Enter right child of " + val);
        node.right = createTree(sc);

        return node;
    }

    public static void main(String[] args) {
        BinaryTreeRecursive tree = new BinaryTreeRecursive();
        Scanner sc = new Scanner(System.in);

        System.out.println("Create your binary tree:");
        tree.root = tree.createTree(sc);

        System.out.println("Preorder traversal of the binary tree:");
        tree.preorderTraversal(tree.root);
    }
}