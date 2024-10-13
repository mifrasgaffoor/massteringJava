package oop.Inheritance;

public class Dog  extends Animal{
    Dog(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        Animal raja =new Animal(23,"raja");
        System.out.println(raja.age);
        System.out.println(raja.name);
    }
}
