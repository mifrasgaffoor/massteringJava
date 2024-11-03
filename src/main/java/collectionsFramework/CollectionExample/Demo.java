package collectionsFramework.CollectionExample;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {

        Collection<Student> students  = new ArrayList<>();

        students.add(new Student(20, "Alice", "A"));
        students.add(new Student(21, "Bob", "B"));
        students.add(new Student(19, "Charlie", "C"));

        // Displaying the collection
        System.out.println("Students in the collection:");
        for (Student student : students) {
            // Implicitly calls student.toString()
            System.out.println(student);
        }

        Collection<String> names  = new ArrayList<>();
        //  Adding elements to the Collection
        names.add("mifras");
        names.add("hamza");
        names.add("Bob");

        // Checking the size
        System.out.println(names.size());

        // Checking if an element exists
        System.out.println(names.contains("mifras"));

        // Iterating over elements
        for(String name:names){
            System.out.println(name);
        }

        // Removing an element
        names.remove("Bob");

        // Clearing the Collection
        names.clear();

        System.out.println("Is the collection empty after clearing? " + names.isEmpty());

    }
}
