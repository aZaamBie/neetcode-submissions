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
    public ListNode reverseList(ListNode head) {
        // Using two pointers
        ListNode current = head;
        ListNode prev = null;

        while (current != null){ // if current == null,m then end of list reached
            ListNode next = current.next; // save next to a temporary variable.
            current.next = prev; // reversing direction of pointer

            prev = current; // shift previous pointer to the current
            current = next; // move current to the actual next pointer
        }

        return prev;
    }
}
