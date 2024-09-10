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
class Solution {
  private int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode current = head;

    while (current != null && current.next != null) {
      int gcdValue = gcd(current.val, current.next.val);
      ListNode newNode = new ListNode(gcdValue, current.next);
      current.next = newNode;
      current = newNode.next;
    }

    return head;
  }
}
