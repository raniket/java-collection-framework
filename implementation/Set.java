package implementation;
import java.util.Objects;



public class Set<K> {
    public class Node<K> {
        public K key;
        public Node<K> next;
        public Node(K key) {
            this.key = key;
        }
    }

    private Node<K> bucket[] = new Node[10];
    private int bucketSize;
    private int size;

    public Set() {
        this.bucketSize = 10;
        this.size = 0;
        for (int i = 0; i < this.bucketSize; i++) {
            this.bucket[i] = null;
        }
    }

    private int getHashCode(K key) {
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key) {
        int hashCode = getHashCode(key);
        int index = hashCode % this.bucketSize;
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public int size() { return this.size; }

    public boolean isEmpty() { return this.size == 0; }

    public boolean add(K key) {
        int index = getBucketIndex(key);
        Node<K> head = bucket[index];

        while(head != null) {
            if (head.key.equals(key)) { return false; }
            head = head.next;
        }

        head = bucket[index];
        Node<K> node = new Node(key);
        node.next = head;
        bucket[index] = node;
        this.size++;

        return true;
    }

    public boolean remove(K key) {
        int index = getBucketIndex(key);
        Node<K> head = bucket[index];
        Node<K> tail = null;

        while(head != null) {
            if (head.key.equals(key)) {
                if (tail == null) bucket[index] = head.next;
                else tail.next = head.next;
                this.size--;
                return true;
            }
            tail = head;
            head = head.next;
        }

        return false;
    }

    public boolean contains(K key) {
        int index = getBucketIndex(key);
        Node<K> head = bucket[index];

        while(head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < this.bucketSize; i++) {
            Node<K> head = bucket[i];
            while(head != null) {
                str += head.key + " ";
                head = head.next;
            }
        }
        return str;
    }
}
