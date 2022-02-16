package framework;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(); // Unordered
//        Set<String> set = new LinkedHashSet<>(); // Maintains the insertion order
//        Set<String> set = new TreeSet<>(); // Sorted

        set.add("John");
        set.add("Doe");
        set.add("Jane");
        set.add("Adams");
        set.add("Doe");

        System.out.println("Initial Set");
        System.out.println("Set: " + set + ", Size: " + set.size() + "\n");

        set.remove("Doe");
        System.out.println("After removing 'Doe'");
        System.out.println("Set: " + set + ", Size: " + set.size() + "\n");

        System.out.println("Contains 'John'? " + set.contains("John")  + "\n");

        System.out.println("Is set empty? " + set.isEmpty() + "\n");

        System.out.println("Iterating over set...");
        Iterator<String> setItr = set.iterator();
        while (setItr.hasNext()) {
            System.out.println(setItr.next());
        }
    }
}
