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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cursor = head;
        int count = 0;
        ListNode prev = null, curr = head, next = null;
        while (cursor != null && count < k) {
            cursor = cursor.next;
            count++;
        }

        if (count < k)
            return head;

        count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}
