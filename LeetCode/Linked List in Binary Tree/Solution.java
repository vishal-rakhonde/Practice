/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean a = false;
    public boolean isSubPath(ListNode head, TreeNode root) {
        help(head,root);
        return a;
    }
    public void help(ListNode head,TreeNode root){
        if(head == null){
            a=true;
            return;
        }
        if(root == null){
            return;
        }
        if(head.val==root.val){
            helper(head.next,root.left);
            helper(head.next,root.right);
        }
        help(head,root.left);
        help(head,root.right);
    }
    public void helper(ListNode head,TreeNode root){
        if(head == null){
            a=true;
            return;
        }
        if(root == null){
            return;
        }
        if(head.val==root.val){
            helper(head.next,root.left);
            helper(head.next,root.right);
        }
    }
}