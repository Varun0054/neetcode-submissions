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
        if (head == null || k == 1) return head;

        // Dummy node to handle edge cases where the head itself changes
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = dummy;
        ListNode next = dummy;
        int count = 0;

        // Step 1: Count the total number of nodes in the list
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Step 2: Loop as long as we have at least k nodes left to process
        while (count >= k) {
            curr = prev.next; // 'curr' points to the start of the current group
            next = curr.next; // 'next' points to the node right after curr

            // Step 3: Reverse the k group by moving nodes forward one by one
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            // Step 4: Move 'prev' to the end of the newly reversed group for the next iteration
            prev = curr;
            count -= k;
        }

        return dummy.next;
    }
}