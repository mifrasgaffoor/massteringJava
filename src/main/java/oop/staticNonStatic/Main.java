package oop.staticNonStatic;

public class Main {
    public static void main(String[] args) {
        Human mif = new Human(24,"MIf" ,false);
        Human Perera =  new Human(25,"perea",true);
        System.out.println(Human.population);

        // non static call
        mif.sayGreeting();

        // static call
        Human.sayGoodMoring();

    }
}
