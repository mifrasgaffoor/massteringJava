package indermedidate.exceptionHandling.unchecked;

import java.util.Scanner;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("program is started... ");


        // ArithmeticException
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scanner.nextInt();
        System.out.println(100/n);


        // ArrayIndexOutOfBoundsException
        int[] arr = new int[4];
        System.out.print("Enter the position (0-4): ");
        int pos = scanner.nextInt(); // Read the position from the user
        System.out.print("Enter a value: ");
        int value = scanner.nextInt(); // Read the value from the user
        arr[pos] = value; // Assign the value to the specified position
        System.out.println("Value " + value + " entered at position " + pos + ".");


        // NumberFormatException
        String str = "welcome";
        int num = Integer.parseInt(str);
        System.out.println(num);

        //NullPointerExceptionl
        String s = null;
        System.out.println(s.length());


        System.out.println();
        System.out.println("Program is continuing...");
        System.out.println("ppgaming is ended...");
    }
}
