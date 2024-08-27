/*  N-ary Tree Postorder Traversal

Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

 

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
 

Constraints:

The number of nodes in the tree is in the range [0, 104].
0 <= Node.val <= 104
The height of the n-ary tree is less than or equal to 1000.
 
 */
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.add(current.val);
            
            for (Node child : current.children) {
                stack.push(child);
            }
        }

        Collections.reverse(result);
        return result;
    }
}

public class NaryTreePostorderTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the tree in level order (use -1 to represent null):");
        
        String[] input = scanner.nextLine().split(" ");
        Queue<Node> queue = new LinkedList<>();
        
        if (input.length == 0 || input[0].equals("-1")) {
            System.out.println("[]");
            return;
        }
        
        Node root = new Node(Integer.parseInt(input[0]));
        queue.add(root);
        int index = 1;
        
        while (!queue.isEmpty() && index < input.length) {
            Node current = queue.poll();
            List<Node> children = new ArrayList<>();
            
            while (index < input.length && !input[index].equals("-1")) {
                Node child = new Node(Integer.parseInt(input[index]));
                children.add(child);
                queue.add(child);
                index++;
            }
            
            current.children = children;
            index++;
        }
        
        Solution solution = new Solution();
        List<Integer> result = solution.postorder(root);
        System.out.println(result);
        
        scanner.close();
    }
}
