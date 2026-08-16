class Solution {
    public void reorderList(ListNode head) {

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode current = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (current != null) {
            fast = current.next;
            current.next = prev;
            prev = current;
            current = fast;
        }

        // 3. Merge
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            ListNode leftNext = left.next;
            ListNode rightNext = right.next;

            left.next = right;
            right.next = leftNext;

            left = leftNext;
            right = rightNext;
        }
    }
}