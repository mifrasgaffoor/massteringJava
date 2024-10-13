package oop.Inheritance;

import oop.packageExample.b.B;

public class Main {


    public static void main(String[] args) {

        BoxClass box = new BoxClass(3);
        BoxClass box1 =  new BoxClass(box);
        System.out.println(box.l + " " +  box.w + " "+  box.h);

        ChildBox childBox =  new ChildBox();
        ChildBox childBox1 = new ChildBox(2,3,4,5);
        System.out.println(childBox1.l + " " + childBox1.h + " " + childBox1.w+ " " + childBox1.weight);


    }

}
