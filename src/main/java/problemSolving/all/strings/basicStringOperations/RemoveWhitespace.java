package problemSolving.all.strings.basicStringOperations;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);

        // OR


        String str1 = "  He llo,   Wor ld!  ";

        // Remove all whitespace from the string
        String noWhitespace = str1.replaceAll("\\s+", "");;
        // Print the result
        System.out.println("String without whitespace: '" + noWhitespace + "'");
    }
}
