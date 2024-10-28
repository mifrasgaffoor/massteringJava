package basic.practiceQuestions;

import java.util.Scanner;

public class Q3 {
    // 1 . Get input for Variable Mark. If mark > 35 print pass. Else Print fail.
    /*
Get input for Variable Income. if Income is
greater than 7000 scholarship is available.
Else not eligible for scholarship.

*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scanner.nextInt();

        if (n > 34){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }


        long income = scanner.nextLong();
        System.out.print("Enter income");
        if (income < 7000){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
    }


}
