package collectionsFramework.set;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("mifras");
        ls.add("hamza");
        ls.add("Alice");
        ls.add("Bob");
        ls.add("Alice");
        ls.add("Charlie");
        ls.add("mifras");

        System.out.println("Original LinkedList (with duplicates): " + ls);

        // Create a HashSet from the LinkedList to remove duplicates
        HashSet<String> hs = new HashSet<>(ls);

        // Display HashSet
        System.out.println("HashSet (duplicates removed): " + hs);

        // Check if an element exists
        String elementToCheck = "mifras";
        System.out.println("Does HashSet contain '" + elementToCheck + "'? " + hs.contains(elementToCheck));

        // Remove an element
        hs.remove("Alice");
        System.out.println("HashSet after removing 'Alice': " + hs);

        // Iterate through the HashSet
        System.out.print("Iterating through HashSet: ");
        for (String element : hs) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());
    }
}
