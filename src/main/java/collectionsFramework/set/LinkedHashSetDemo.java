package collectionsFramework.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        // Add elements
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Duplicate, will be ignored

        // Display LinkedHashSet
        System.out.println("LinkedHashSet: " + cities);

        // Check if an element exists
        System.out.println("Contains Chicago? " + cities.contains("Chicago"));


        // Remove an element
        cities.remove("Los Angeles");
        System.out.println("After removing Los Angeles: " + cities);

        // Iterate through the LinkedHashSet
        for (String city : cities) {
            System.out.println(city);
        }


        // Size of the LinkedHashSet
        System.out.println("Size: " + cities.size());


    }
}
