package oop.Inheritance;

public class Animal {
    int age ;
    String name ;

    Animal(int age , String name){
        this.age = age;
        this.name = name;
    }
    void callAnimal(){
        System.out.println("Hi there !");
    }
}
