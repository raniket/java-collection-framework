package implementation;

import java.util.Arrays;

public class MinIntHeap {

    private int capacity = 10;
    private int size = 0;

    private int[] items = new int[capacity];

    private int getLeftChildIndex(int index) { return (index * 2) + 1; }
    private int getRightChildIndex(int index) { return (index * 2) + 2; }
    private int getParentIndex(int index) { return (index - 1) / 2;   }

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }

    private int leftChild(int index) { return items[getLeftChildIndex(index)]; }
    private int rightChild(int index) { return items[getRightChildIndex(index)]; }
    private int parent(int index) { return items[getParentIndex(index)]; }

    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            capacity = capacity * 2;
            items = Arrays.copyOf(items, capacity);
        }
    }

    public int peak() throws Exception{
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll() throws Exception{
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index) ) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[index] < items[smallerChildIndex]) break;
            else swap(index, smallerChildIndex);
            index = smallerChildIndex;
        }
    }

    public void add(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        while(hasParent(index) && parent(index) > items[index]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < size; i++) {
            str += items[i] + " ";
        }
        return str;
    }

}



