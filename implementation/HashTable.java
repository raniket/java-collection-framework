package implementation;
import java.util.ArrayList;
import java.util.Objects;



public class HashTable<K, V> {
    public class Node<K, V> {
        public K key;
        public V value;
        public int hashCode;
        public Node<K, V> next; // Linker

        public Node(K key, V value, int hashCode) {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }
    }
    private ArrayList<Node<K, V>> bucket;
    private int bucketSize;
    private int size;

    public HashTable() {
        bucket = new ArrayList<>();
        this.bucketSize = 10;
        this.size = 0;

        for(int i = 0; i < bucketSize; i++) bucket.add(null);
    }

    public int size() { return size; }

    public boolean isEmpty() { return size() == 0; }

    private int getHashCode(K key) { return Objects.hashCode(key); }

    private int getBucketIndex(K key) {
        int hashCode = getHashCode(key);
        int index = hashCode % bucketSize;
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        int hashCode = getHashCode(key);

        Node<K, V> head = bucket.get(index);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> node = new Node(key, value, hashCode);
        head = bucket.get(index);
        node.next = head;
        bucket.set(index, node);
        size++;

        // If load factor goes beyond the threshold, double the HT size.
        if ((1.0 * size) / bucketSize >= 0.7) {
            ArrayList<Node<K, V>> temp = bucket;
            bucket = new ArrayList<>();
            bucketSize = bucketSize * 2;
            size = 0;
            for(int i = 0; i < bucketSize; i++) bucket.add(null);
            for(Node<K,V> headNode : temp) {
                while(headNode != null) {
                    put(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        int hashCode = getHashCode(key);

        Node<K, V> head = bucket.get(index);

        while(head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public boolean remove(K key) {
        int index = getBucketIndex(key);
        int hashCode = getHashCode(key);

        Node<K, V> head = bucket.get(index);
        Node<K, V> prev = null;

        while(head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) break;
            prev = head;
            head = head.next;
        }

        if (head == null) return false;

        size--;

        if (prev == null) bucket.set(index, head.next);
        else prev.next = head.next;

        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < bucketSize; i++) {
            Node<K, V> head = bucket.get(i);
            while(head != null) {
                sb.append(head.key + ":" + head.value + ", ");
                head = head.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
