package indermedidate.innerClass;


abstract class AbstractClass {
    abstract void display();
}

public class InnerClassDemo {

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass() {
            void display() {
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.display(); // Calling method of anonymous inner class
    }
}


class Outter{
    private int outerField = 10;
    class Inner{
        void display() {
            System.out.println("Outer field: " + outerField); // Accessing outer class field
        }
    }
}

class staticOuterClass{
    static int staticOuterField = 20;
    static  class StaticNested{
        void display() {
            System.out.println("Static Outer field: " + staticOuterField); // Accessing static outer field
        }
    }
}



class OuterClassMethod {
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.display(); // Accessing local inner class
    }
}



