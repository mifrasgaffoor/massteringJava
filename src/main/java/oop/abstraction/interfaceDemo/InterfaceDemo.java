package oop.abstraction.interfaceDemo;

public interface InterfaceDemo {

    // Blueprint of a class




    // final , static variable
    int age = 25  ;


    // abtract method
    void abstractMethod();


    // default method with implementation

    default void  defaultMethod(){
        System.out.println("defaultMethod..");
    }


    // Static method with implementation
    static  void staticMethod(){
        System.out.println("staticMethod");
    }
}
