package framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(); // HashMap is non-synchronized. It is not thread-safe
//        Map<String, String> map = new Hashtable<String, String>(); // Hashtable is synchronized. It is thread-safe
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");

        System.out.println("Initial map: " + map);

        System.out.println("\nRemoving the key \"1\"..." + map.remove("1"));

        System.out.println("\nmap after removing the key \"1\": " + map);

        System.out.println("Iterating through the map...");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
    }
}
