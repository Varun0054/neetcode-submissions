class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node node2 = new Node(head.val);
        Node current = head;
        Node copyCurrent = node2;

        // Copy the nodes and next pointers
        while (current.next != null) {
            copyCurrent.next = new Node(current.next.val);

            current = current.next;
            copyCurrent = copyCurrent.next;
        }

        // Copy random pointers
        current = head;
        copyCurrent = node2;

        while (current != null) {

            if (current.random != null) {
                Node temp = head;
                Node tempCopy = node2;

                while (temp != current.random) {
                    temp = temp.next;
                    tempCopy = tempCopy.next;
                }

                copyCurrent.random = tempCopy;
            }

            current = current.next;
            copyCurrent = copyCurrent.next;
        }

        return node2;
    }
}