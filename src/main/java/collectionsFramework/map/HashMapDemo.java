package collectionsFramework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        // Add key-value pairs
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // Retrieve a value by key
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Update a value
        scores.put("Alice", 90);
        System.out.println("Updated Alice's score: " + scores.get("Alice"));

        // Check if a key exists
        System.out.println("Contains key 'Bob'? " + scores.containsKey("Bob"));

        // Remove a key-value pair
        scores.remove("Charlie");

        // Print all key-value pairs
        System.out.println("All scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }




    }
}
