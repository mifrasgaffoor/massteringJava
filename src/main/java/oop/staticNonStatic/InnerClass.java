package oop.staticNonStatic;


class  Test2 {
    int age ;
    Test2(int age){
        this.age = age;
    }
}
public class InnerClass {
    static  class Test{
        int age ;
        Test(int age){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Test test = new Test(23);
        Test2 test2  = new Test2(34);
    }
}
