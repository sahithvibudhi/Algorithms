public class HashTable {
    private Node[] table;

    class Node {
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return String.format("%d=%d", key, value);
        }
    }

    public HashTable(int slots) {
        table = new Node[slots];
    }

    private int hash(int key) {
        return key % table.length;
    }

    public Node get(int key) {
        int index = hash(key);
        Node node = table[index];
        while (node != null && node.key != key)
            node = node.next;
        return node;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node pointer = table[index];
        Node node = new Node(key, value);
        node.next = pointer;
        table[index] = node;
    }

    // USAGE:
    // public static void main(String[] args) {
    //     HashTable table = new HashTable(9);
    //     table.put(5, 10);
    //     System.out.println(table.get(5));
    //     System.out.println(table.get(10));
    // }

}