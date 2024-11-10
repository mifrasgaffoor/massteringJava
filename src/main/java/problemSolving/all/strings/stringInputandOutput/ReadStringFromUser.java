package problemSolving.all.strings.stringInputandOutput;

import java.util.Scanner;

public class ReadStringFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        scanner.close();

    }
}
