package oop.abstraction.abractClass;

import oop.packageExample.a.A;

abstract  class Animal {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Reference type is Animal
        Animal cat = new Cat(); // Reference type is Animal

        // Call the makeSound method
        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!

        // Call the eat method
        dog.eat(); // Output: Eating...
        cat.eat(); // Output: Eating...


        // can not instantiate
        // Animal animal = new Animal() ;
    }
    abstract void makeSound(); // Abstract method
    void eat() { // Concrete method
        System.out.println("Eating...");
    }
}
