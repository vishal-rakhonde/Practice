import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SplitTrees {

    public TreeNode[] splitTree(TreeNode root, int value) {
        if (root == null) return new TreeNode[] { null, null };
        if (root.val < value) {
            TreeNode[] split = splitTree(root.right, value);
            root.right = split[0];
            return new TreeNode[] { root, split[1] };
        } else {
            TreeNode[] split = splitTree(root.left, value);
            root.left = split[1];
            return new TreeNode[] { split[0], root };
        }
    }

    public static TreeNode buildTree(Scanner sc) {
        System.out.print("Enter node value (-1 for null): ");
        int val = sc.nextInt();
        if (val == -1) return null;
        TreeNode node = new TreeNode(val);
        node.left = buildTree(sc);
        node.right = buildTree(sc);
        return node;
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SplitTrees st = new SplitTrees();

        System.out.println("Build the binary tree:");
        TreeNode root = buildTree(sc);

        System.out.print("Enter value to split the tree: ");
        int value = sc.nextInt();

        TreeNode[] result = st.splitTree(root, value);

        System.out.println("First Tree (<= value):");
        printTree(result[0]);

        System.out.println("\nSecond Tree (> value):");
        printTree(result[1]);
    }
}
