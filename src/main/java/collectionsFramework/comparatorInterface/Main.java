package collectionsFramework.comparatorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(23, "mifras");
        Person p2 = new Person(2, "muathhmazaa");

        Person[] people = {p1, p2};
        ArrayList al = new ArrayList();
        al.add(p1);
        al.add(p2);


        for (Object obj : people) {
            System.out.println(obj);
        }

        ComparatorInterfaceDemo comparatorInterfaceDemo = new ComparatorInterfaceDemo();
        int res = comparatorInterfaceDemo.compare(p1, p2);
        System.out.println("Comparison result (p1 vs p2): " + res);

        // Sort the array using the comparator
        Arrays.sort(people, comparatorInterfaceDemo);
        System.out.println("Sorted array:");
        for (Person person : people) {
            System.out.println(person);
        }


        Collections.sort(al, comparatorInterfaceDemo);
        System.out.println("Sorted array:");
        for (Object p : al) {
            System.out.println(p);
        }


    }
    }
