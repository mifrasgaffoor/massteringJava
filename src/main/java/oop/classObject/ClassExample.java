package oop.classObject;

public class ClassExample {

}
 class Animal{
    int numOfLegs = 4 ;
    String name = "Jhone";
    String color = "black";


    // no argus Constructor
    Animal(){
        numOfLegs = 34;
        color = "white";
    }

    // Copy Constructor
    Animal(Animal other){
        this.color = other.color;
        this.name = other.name;
        this.numOfLegs = other.numOfLegs;
    }

    // parameterized Constructor
    Animal(int count,String color){
        this.color = color;
        this.numOfLegs = count;
    }
    void makeSound(){
        System.out.println("Sound.............");
    }

    void eatFood(){
        System.out.println("Animal is color" + this.color);
    }
}