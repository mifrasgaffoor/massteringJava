package oop.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Method overloading
        Calculator cal = new Calculator();
        int sum = cal.add(2,3);
        int sum2 = cal.add(2,3,4);
        System.out.println(sum + " " + sum2);

        // Constructors overloading
        Person p = new Person(23);
        System.out.println(p.age);
        Person person = new Person(34,"Nemal");
        System.out.println(person.age);
        System.out.println(person.name);

        //In dynamic method dispatch, the decision of which method to call is made at runtime, based on the actual object's type, not the reference type.
        Animal animal = new Dog();
        animal.sleep();




    }

}
