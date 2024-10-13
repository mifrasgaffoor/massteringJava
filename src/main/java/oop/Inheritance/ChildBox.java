package oop.Inheritance;

public class ChildBox  extends  BoxClass{
    int weight ;

    public ChildBox() {
        super();
        this.weight = -2;
    }

    public ChildBox(int l, int h, int w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
