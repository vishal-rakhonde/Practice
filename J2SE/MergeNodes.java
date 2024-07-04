/* Merge Nodes in Between Zeros

You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.

Example 1:
Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.

Example 2:
Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 1 = 1.
- The sum of the nodes marked in red: 3 = 3.
- The sum of the nodes marked in yellow: 2 + 2 = 4.
 
Constraints:
The number of nodes in the list is in the range [3, 2 * 105].
0 <= Node.val <= 1000
There are no two consecutive nodes with Node.val == 0.
The beginning and end of the linked list have Node.val == 0
*/

class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        // BASE CASE -> if we have a single zero, simply return null
        if (head.next == null) return null;
        
        // fetch sum from current 0 to next 0
        ListNode ptr = head.next;
        int sum = 0;
        while (ptr.val != 0) {
            sum += ptr.val;
            ptr = ptr.next;
        }
        
        // assign sum on the first node between nodes having value 0
        head.next.val = sum;
        
        // call and get the answer and connect the answer to next of head->next
        head.next.next = mergeNodes(ptr);
        
        // return head->next..=> new head
        return head.next;
    }
    
    public static void main(String[] args) {
        // Example usage or testing can be placed here
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        Solution solution = new Solution();
        ListNode result = solution.mergeNodes(node1);
        
        // Print the merged list or perform any other actions with the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

