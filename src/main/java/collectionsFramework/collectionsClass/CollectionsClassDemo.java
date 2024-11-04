package collectionsFramework.collectionsClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsClassDemo {
    public static void main(String[] args) {

        ArrayList <Integer> ls = new ArrayList<>();
        ls.add(23);
        ls.add(3);
        ls.add(1);
        ls.add(100);

        System.out.println(ls);
        // Sorts the specified list into ascending order.
        Collections.sort(ls);
        System.out.println(ls);

        // Searches for the specified key in a sorted list using binary search.
        System.out.println(Collections.binarySearch(ls,1));
        System.out.println(Collections.binarySearch(ls,3));
        System.out.println(Collections.binarySearch(ls,2));


    }
}
