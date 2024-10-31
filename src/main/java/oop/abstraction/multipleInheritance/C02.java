package oop.abstraction.multipleInheritance;

public class C02  extends  C01 implements  I01,I02{
    public static void main(String[] args) {
        C02 c02 = new C02();
        c02.m1();
        c02.m2();
        c02.c1Method();

    }


    @Override
    public void m1(){
        System.out.println("M1 from I01");
    }

    @Override
    public void m2(){
        System.out.println("M2 from I02");
    }

}
