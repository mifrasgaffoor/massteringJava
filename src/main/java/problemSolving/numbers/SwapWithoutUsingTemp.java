package problemSolving.numbers;

public class SwapWithoutUsingTemp {
    public static void main(String[] args) {
        int a = 23 ;
        int b = 45 ;

        a = b - a ; // 45- 23 =  22;
        b = b - a ; // 45 - 22 = 23 ;
        a = a + b ;  // 22  + 23 = 45 ;

        System.out.println(a);
        System.out.println(b);




    }
}
