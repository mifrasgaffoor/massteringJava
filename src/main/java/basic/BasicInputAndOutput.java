package basic;

import java.util.Scanner;

public class BasicInputAndOutput {
    public static void main(String[] args) {

        System.out.println("I'm Learning java");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int no =  scanner.nextInt();

        scanner.close();



    }
}
