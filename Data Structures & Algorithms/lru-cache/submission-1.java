
class LRUCache {
    class DLLNode {
        DLLNode next;
        DLLNode prev;
        int key;
        int value;
        DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    DLLNode head;
    DLLNode tail;
    int size;
    int capacity;
    private HashMap<Integer, DLLNode> map;

    public LRUCache(int capacity) {
        head = null;
        tail = null;
        size = 0;
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        DLLNode node = findKey(key);
        if (node == null)
            return -1;

        moveNodeToEnd(node);
        return node.value;
    }

    private void moveNodeToEnd(DLLNode node) {
        if (node == tail) {
            return;
        }
        
        DLLNode next = node.next;
        DLLNode prev = node.prev;

        node.next = null;
        node.prev = null;

        if (prev == null) {
            head = next;
            if (next != null) {
                next.prev = null;
            }
        } else {
            prev.next = next;
            if (next != null) {
                next.prev = prev;
            }
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    private void addAtEnd(int key, int value) {
        DLLNode newNode = new DLLNode(key, value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    private void deleteHead() {
        if (head == null)
            return;

        map.remove(head.key); // Remove from map during eviction
        head = head.next;
        
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
    }

    private DLLNode findKey(int key) {
        return map.get(key);
    }

    public void put(int key, int value) {
        DLLNode node = findKey(key); // Fixed: passed 'key' instead of 'node'

        if (node != null) {
            node.value = value;
            moveNodeToEnd(node);
        } else {
            if (size >= capacity) {
                deleteHead(); // Evicts LRU element, updates map, and decrements size
            }
            addAtEnd(key, value);
            map.put(key, tail);
            size++;
        }
    }
}