package oop.abstraction;

public class ClassDemo implements InterfaceDemo {

    public static void main(String[] args) {
        // CASE - 01
        ClassDemo classDemo = new ClassDemo();
        //  calling abstractMethod
        classDemo.abstractMethod();
        // calling defaultMethod
        classDemo.defaultMethod();
        // calling staticMethod
        InterfaceDemo.staticMethod();

        // calling classMethod
        classDemo.classMethod();

        // CASE-02
        InterfaceDemo interfaceDemo = new ClassDemo();
        //  calling abstractMethod
        interfaceDemo.abstractMethod();
        // calling defaultMethod
        interfaceDemo.defaultMethod();
        // calling staticMethod
        InterfaceDemo.staticMethod();


        // interfaceDemo.classMethod() -cannot call from interface reference dont have this method in interface

    }


    // implementation for  abstractMethod in class
    @Override
    public void abstractMethod(){
        System.out.println("abstractMethod");
    }


    void classMethod(){
        System.out.println("This is class Method belongs to ClassDemo");
    }

}
