package oop.classObject;

//import oop.Animal;

public class ObjectExample {
    public static void main(String[] args) {
        Animal animal =  new Animal();
        Animal random = new Animal(animal);
        System.out.println(random.name);
        Animal animal1 = new Animal(3,"Brown");
        System.out.println(animal1.color);
        System.out.println(animal.color);
        animal.eatFood();

//        String color = animal.color;
//        System.out.println(color);
    }


}
