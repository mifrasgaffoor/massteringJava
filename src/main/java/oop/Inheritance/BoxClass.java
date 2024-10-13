package oop.Inheritance;

public class BoxClass {
    int l ;
    int w ;
    int h ;

    BoxClass(){
        this.h = -1 ;
        this.l = -1;
        this.w = 1;

    }

    // SQURE
    BoxClass(int side){
        this.h = side;
        this.l = side;
    }

    // Cube
    BoxClass(int l , int h , int w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
    BoxClass(BoxClass old){
        this.h = old.h;
        this.l = old.l;
        this.w =old.w;
    }

    void information(){
        System.out.println("Running the box...");
    }



}
