class Solution {

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        // Insert copied nodes between original nodes
        while (curr != null) {
            Node newNode = new Node(curr.val);

            newNode.next = curr.next;
            curr.next = newNode;

            curr = newNode.next;
        }

        // Set random pointers
        curr = head;

        while (curr != null) {

            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }

        // Separate the two lists
        curr = head;

        Node newHead = head.next;
        Node newCurr = newHead;

        while (curr != null) {

            curr.next = newCurr.next;
            curr = curr.next;

            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }
}