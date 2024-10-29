package problemSolving.numbers;

public class SwapNum {
    public static void main(String[] args) {
        int a = 23 ;
        int b = 34;

        System.out.println("A is" +a);
        System.out.println("B is" +b);
        int temp = a ;

        a = b ;

        b = temp ;
        System.out.println("A is" +a);
        System.out.println("B is" +b);
    }
}
