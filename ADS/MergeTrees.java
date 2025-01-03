import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public TreeNode buildTree(Scanner sc) {
        System.out.print("Enter root value (-1 for null): ");
        int val = sc.nextInt();
        if (val == -1) return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.print("Enter left child of " + current.val + " (-1 for null): ");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.offer(current.left);
            }

            System.out.print("Enter right child of " + current.val + " (-1 for null): ");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.offer(current.right);
            }
        }
        return root;
    }

    public void printTree(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeTrees mergeTrees = new MergeTrees();

        System.out.println("Build first tree:");
        TreeNode t1 = mergeTrees.buildTree(sc);

        System.out.println("Build second tree:");
        TreeNode t2 = mergeTrees.buildTree(sc);

        TreeNode mergedTree = mergeTrees.mergeTrees(t1, t2);

        System.out.println("Merged tree:");
        mergeTrees.printTree(mergedTree);
    }
}
