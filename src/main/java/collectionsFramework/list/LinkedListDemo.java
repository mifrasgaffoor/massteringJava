package collectionsFramework.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> ls1 = new LinkedList<>();
        LinkedList<Integer> ls2 = new LinkedList<>();
        LinkedList ls3 = new LinkedList();

        // Adding elements
        ls1.add("mango");
        ls1.add("apple");
        ls1.add("orange");

        // Accessing elements
        System.out.println(ls1.get(0));


        // Removing elements
        ls1.remove(2);
        System.out.println(ls1);

        System.out.println(ls1);
        // Displaying elements



    }
}
