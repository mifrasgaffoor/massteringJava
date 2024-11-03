package collectionsFramework.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create an ArrayList to hold String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Banana"); // Duplicates are allowed
        // not possible use generics  if use create  ArrayList fruits = new ArrayList<>() then possible to add number object
        // fruits.add(23)

        // Display the ArrayList
        System.out.println(fruits);

        // Accessing elements
        System.out.println(fruits.get(0));


        // Inserting an element at a specific index
        fruits.add(2,"apple");
        System.out.println(fruits);

        // Removing an element by index
        fruits.remove(2);
        System.out.println("Fruits after removing 'apple': " + fruits);

        // Checking the size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Checking if an element exists
        boolean hasCherry = fruits.contains("Cherry");
        System.out.println("Contains Cherry: " + hasCherry);

        // Getting the index of an element
        int indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana);

        // Clear the ArrayList
        fruits.clear();
        System.out.println("Fruits after clear: " + fruits);



    }
}
