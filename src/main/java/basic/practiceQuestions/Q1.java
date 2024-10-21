package basic.practiceQuestions;

import java.util.Scanner;

public class Q1 {
    /*

    1.Get input for variable: Name and Age.

    Sample Input:
            John
              23

    Sample Output:
    My name is John
    My aqe is 24

    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Age : ");
        int age = scanner.nextInt();

        System.out.println("My name is : " + " " + name);
        System.out.println("My Age is : " + " " + age);


    }

}
