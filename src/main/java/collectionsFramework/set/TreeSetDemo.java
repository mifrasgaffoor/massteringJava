package collectionsFramework.set;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList<>();
        ls.add(23);
        ls.add(2);
        ls.add(10);
        ls.add(4);
        System.out.println(ls);
        System.out.println("After TreeSet");
        TreeSet or = new TreeSet(ls);
        System.out.println(or);
        TreeSet numbers = new TreeSet();

        // Add elements
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);


        // Display TreeSet in ascending order
        System.out.println("TreeSet: " + numbers);

        // Check if an element exists
        System.out.println("Contains 15? " + numbers.contains(15));

        // Get the first and last elements
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Retrieve a subset of elements
        System.out.println("Elements less than 15: " + numbers.headSet(15));
        System.out.println("Elements from 10 onward: " + numbers.tailSet(10));
    }
}
