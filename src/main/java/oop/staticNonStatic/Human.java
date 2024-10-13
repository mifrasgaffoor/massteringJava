package oop.staticNonStatic;

public class Human {
    int age ;
    String name;
    boolean isMarried;

    // statci variable
    static  long population ;

        Human (int age , String  name , boolean isMarried){
            this.age = age;
            this.name = name;
            this.isMarried = isMarried;
            Human.population += 1;

        }

        void sayGreeting(){
            // can  call  static member into non static method
            sayGoodMoring();
            System.out.println("Hi there");
        }

        // static method
        static  void  sayGoodMoring(){
            // can not call non static member into static method
            // sayGreeting();
            System.out.println("Hi Good Moring");
        }

}
