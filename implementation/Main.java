package implementation;

public class Main {
    public static void main(String[] args) throws Exception {
//        Array List Driver
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list.get(0));
//        System.out.println(list.remove(1));
//        System.out.println(list.toString());

//        Linked List Driver
//        LinkedList list = new LinkedList();
//        list.append(1);
//        list.append(2);
//        list.prepend(3);
//        System.out.println(list.toString());
//        list.deleteWithValue(2);
//        System.out.println(list.toString());

//        Stack Driver
//        Stack stack = new Stack();
//        System.out.println("isEmpty(): " + stack.isEmpty());
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.toString());
//        System.out.println("isEmpty(): " + stack.isEmpty());
//        System.out.println("pop(): " + stack.pop());
//        System.out.println(stack.toString());

//        Queue Driver
//        Queue queue = new Queue();
//        System.out.println("isEmpty(): " + queue.isEmpty());
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        System.out.println(queue.toString());
//        System.out.println("isEmpty(): " + queue.isEmpty());
//        System.out.println("peek(): " + queue.peek());
//        System.out.println("dequeue(): " + queue.dequeue());
//        System.out.println(queue.toString());

//        Set Driver
//        Set set = new Set();
//        System.out.println("isEmpty(): " + set.isEmpty());
//        set.add(1);
//        set.add(2);
//        set.add(2);
//        System.out.println(set.toString());
//        System.out.println("isEmpty(): " + set.isEmpty());
//        System.out.println("size(1): " + set.size());
//        System.out.println("contains(1): " + set.contains(1));

//        HashTable Driver
//        HashTable table = new HashTable();
//        System.out.println("isEmpty(): " + table.isEmpty());
//        table.put("a", 1);
//        table.put("b", 2);
//        table.put("c", 3);
//        table.put("c", 0);
//        System.out.println(table.toString());
//        System.out.println("isEmpty(): " + table.isEmpty());
//        System.out.println("size(): " + table.size());
//        System.out.println("get(a): " + table.get("a"));
//        System.out.println("remove(a): " + table.remove("a"));
//        System.out.println("size(): " + table.size());
//        System.out.println("remove(z): " + table.remove("z"));
//        System.out.println("size(): " + table.size());
//        System.out.println(table.toString());

//        Tree Driver
//        Tree tree = new Tree(5);
//        tree.insert(1);
//        tree.insert(2);
//        tree.printInOrder();
//        System.out.println("\ncontains(5): " + tree.contains(5));

//        Trie Driver
//        Trie trie = new Trie();
//        trie.insert("hello");
//        trie.insert("world");
//        trie.insert("helmet");
//        System.out.println("search(hello): " + trie.search("hello"));
//        System.out.println("startsWith(hell): " + trie.startsWith("hell"));
//        System.out.println("startsWith(hel): " + trie.startsWith("hel"));
//        System.out.println("startsWith(hellz): " + trie.startsWith("hellz"));
//        System.out.println("search(world): " + trie.search("world"));

//        Heap Driver
//        MinIntHeap heap = new MinIntHeap();
//        heap.add(5);
//        heap.add(3);
//        heap.add(1);
//        heap.add(4);
//        heap.add(2);
//        System.out.println(heap.toString());
//        System.out.println("peak(): " + heap.peak());
//        System.out.println(heap.toString());
//        System.out.println("poll(): " + heap.poll());
//        System.out.println(heap.toString());

//        Graph Driver
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        System.out.println(graph.toString());
        System.out.println("hasPathDFS(1,3): " + graph.hasPathDFS(1,3));
        System.out.println("hasPathDFS(1,4): " + graph.hasPathDFS(1,4));
        System.out.println("\n");
        System.out.println("hasPathBFS(1,3): " + graph.hasPathBFS(1,3));
        System.out.println("hasPathBFS(1,4): " + graph.hasPathBFS(1,4));
    }
}
