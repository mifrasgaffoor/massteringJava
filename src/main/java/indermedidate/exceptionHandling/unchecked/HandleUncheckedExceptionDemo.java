package indermedidate.exceptionHandling.unchecked;

import java.util.Scanner;

public class HandleUncheckedExceptionDemo {
    public static void main(String[] args) {

        System.out.println("program is started... ");
        // ArithmeticException
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scanner.nextInt();

        try {
            System.out.println(100/n);
        }catch (ArithmeticException e){
            System.out.println("Wrong Number/Data ");
            System.out.println(e.getMessage());
        }

        System.out.println("Program is continuing...");
        System.out.println("ppgaming is ended...");
    }
}
