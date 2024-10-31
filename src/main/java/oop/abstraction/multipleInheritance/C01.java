package oop.abstraction.multipleInheritance;

public class C01  implements I01, I02 {


    public static void main(String[] args) {


        // Multiple Inheritance
         C01 c01 = new C01();
         c01.m1();
         c01.m2();
    }



    @Override
    public void m1(){
        System.out.println("M1 from I01");
    }

    @Override
    public void m2(){
        System.out.println("M2 from I02");
    }


    void c1Method(){
        System.out.println("C01 Method");
    }
}
