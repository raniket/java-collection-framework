package framework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(2);
        queue.add(1);
        queue.add(3);

        System.out.println("Queue elements: " + queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());

        System.out.println("Peek: " + queue.peek());

        System.out.println("Iterating over queue... ");
        Iterator<Integer> itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
