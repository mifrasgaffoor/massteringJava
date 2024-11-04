package collectionsFramework.comparatorInterface;

import dsa.C;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInterfaceDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        // Step 1: Cast the first object to Person
        Person person1 = (Person) o1;

        // Step 2: Cast the second object to Person
        Person person2 = (Person) o2;

        // Step 3: Retrieve the age attribute from each Person
        int age1 = person1.age;
        String name1 = person1.name;
        int age2 = person2.age;
        String name2 = person2.name;
        // Step 4: Compare the ages

        // Step 4: Compare the ages
//        if (age1 == age2) {
//            return 0;
//        } else if (age1 > age2) {
//            return 1;
//        } else {
//            return -1;
//        }

        // Step 4: Compare the name length
        // Compare by name
        // return person1.name.compareTo(person2.name)


        if (name2.length() == name1.length()) {
            return 0;
        } else if (name2.length() > name1.length()) {
            return 1;
        } else {
            return -1;
        }

    }
}
