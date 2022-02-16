package implementation;

public class Queue {

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove from here
    private Node tail; // add here

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void enqueue(int data) {
        Node node = new Node(data);

        if (tail != null) {
            tail.next = node;
        }

        tail = node;

        if (head == null) {
            head = node;
        }
    }

    public int dequeue() {
        int data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public String toString() {
        String str = "";
        Node current = head;
        while(current != null) {
            str += current.data + " ";
            current = current.next;
        }
        return str;
    }
}
