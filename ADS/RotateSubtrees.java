import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class RotateSubtrees {

    public TreeNode rotateRight(TreeNode y) {
        TreeNode x = y.left;
        if (x == null) return y;
        TreeNode T = x.right;
        x.right = y;
        y.left = T;
        return x;
    }

    public TreeNode rotateLeft(TreeNode x) {
        TreeNode y = x.right;
        if (y == null) return x;
        TreeNode T = y.left;
        y.left = x;
        x.right = T;
        return y;
    }

    public void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RotateSubtrees rotateSubtrees = new RotateSubtrees();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Initial Tree (in-order):");
        rotateSubtrees.printTree(root);
        System.out.println();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Rotate Left");
            System.out.println("2. Rotate Right");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    root = rotateSubtrees.rotateLeft(root);
                    System.out.println("Tree after left rotation (in-order):");
                    rotateSubtrees.printTree(root);
                    System.out.println();
                    break;
                case 2:
                    root = rotateSubtrees.rotateRight(root);
                    System.out.println("Tree after right rotation (in-order):");
                    rotateSubtrees.printTree(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
