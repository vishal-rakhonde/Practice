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
}
