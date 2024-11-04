package collectionsFramework.map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put (101,"muath");
        tm.put (102,"mifras");
        TreeMap nw= new TreeMap() ;
        nw.putAll(tm);
        System.out.println(nw);

    }
}
