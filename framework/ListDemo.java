package framework;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<String>(); // Index based
//         LinkedList<String> list = new LinkedList<>(); // Pointer based
//        Vector<String> list = new Vector<>(); // This is same as ArrayList, but it is synchronized and thread safe
//        Stack<String> list = new Stack<>(); // This is a LIFO data structure, supports push and pop operations

        list.add("John");
        list.add("Doe");
        list.add("Jane");
        list.add("Adams");
        list.add("Doe");

        System.out.println("Initial List");
        System.out.println("List: " + list + ", Size: " + list.size() + "\n");

        System.out.println("Item at Index 0': " + list.get(0)  + "\n");

        list.remove("Doe");
        System.out.println("After removing 'Doe'");
        System.out.println("List: " + list + ", Size: " + list.size() + "\n");

        System.out.println("Contains 'John'? " + list.contains("John")  + "\n");

        System.out.println("Index of 'Jane': " + list.indexOf("Jane")  + "\n");

        System.out.println("Is list empty? " + list.isEmpty() + "\n");

        System.out.println("Iterating over list...");
        Iterator<String> listItr = list.iterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

//        System.out.println("\nStack specific operations");
//        System.out.println("Pushing 'Tony' to the top of the list: " + list.push("Tony"));
//        System.out.println("Pop from the top of the list: " + list.pop());
//        System.out.println("\nList after pushing and popping: " + list);
    }
}