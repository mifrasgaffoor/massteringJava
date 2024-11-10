package problemSolving.all.strings.basicStringOperations;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("Strings are equal (case-insensitive).");
        } else if (result < 0) {
            System.out.println("First string is lexicographically less than the second.");
        } else {
            System.out.println("First string is lexicographically greater than the second.");
        }
    }
}
