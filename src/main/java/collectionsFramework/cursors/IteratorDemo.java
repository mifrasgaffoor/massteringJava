package collectionsFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Object> ls = new ArrayList<>(); // Use generics for type safety
        ls.add(23);
        ls.add(24);
        ls.add("hamza");
        ls.add(56);
        ls.add(4);
        ls.add(123);

        // Create an iterator for the list
        Iterator<Object> i = ls.iterator();

        // Use the iterator to traverse the list
        while (i.hasNext()) {
            Object obj = i.next(); // Get the next element

            // Print the element
            System.out.println(obj);

            // Remove the element if it matches "hamza"
            if (obj.equals("hamza")) {
                i.remove(); // Correctly remove the current element
            }
        }

        // Print the updated list
        System.out.println("Updated List: " + ls);
    }
}
