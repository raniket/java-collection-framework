package implementation;

public class Stack {

    private class Node {
        private int data;
        private Node next;

        private Node(int value) {
            this.data = value;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public String toString() {
        String response = "";
        Node current = top;
        while(current != null) {
            response += current.data + " ";
            current = current.next;
        }
        return response;
    }
}
