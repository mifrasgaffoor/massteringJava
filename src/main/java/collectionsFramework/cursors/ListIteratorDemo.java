package collectionsFramework.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        Laptop lenova = new Laptop(1,"ideaPad");
        Laptop dell = new Laptop(2,"Dell Inspiron ");


        ArrayList<Object> ls = new ArrayList<>(); // Use generics for type safety
        ls.add(23);
        ls.add(24);
        ls.add("hamza");
        ls.add(56);
        ls.add(4);
        ls.add(123);
        ls.add(dell);
        ls.add(lenova);

        System.out.println("Before : " +ls);

        ListIterator lils = ls.listIterator();

        lils.add("mifras");

        System.out.println(ls);

        while (lils.hasNext()) {
            Object obj = lils.next();
            // Change "hamza" to "muath"
            if (obj.equals("hamza")) {
                lils.set("muath");
            }

            // Check if the object is an instance of Laptop
            if (obj instanceof Laptop) {
                Laptop laptop = (Laptop) obj;
                // Change companyName for lenova
                if (laptop.getCompanyName().equals("ideaPad")) {
                    laptop.setCompanyName("ideaPad-330");
                }
            }
        }

        System.out.println("After: "+ls);





    }
}
