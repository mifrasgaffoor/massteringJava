package problemSolving.numbers;

public class Subtraction {
    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction();
        int Subtraction = subtraction.subtractionFun(23,2);
        System.out.println("Subtraction : " + Subtraction);
    }

    int subtractionFun (int a , int b){
        return b - a ;
    }
}
