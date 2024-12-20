public class RotateSubtrees {
    public TreeNode rotateRight(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T = x.right;
        x.right = y;
        y.left = T;
        return x;
    }

    public TreeNode rotateLeft(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T = y.left;
        y.left = x;
        x.right = T;
        return y;
    }
}
