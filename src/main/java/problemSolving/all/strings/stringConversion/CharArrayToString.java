package problemSolving.all.strings.stringConversion;

public class CharArrayToString {
    public static void main(String[] args) {
        // Create a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        // Convert the character array to a string using the String constructor
        String str = new String(charArray);

        // OR

        // Convert the character array to a string using String.valueOf()
        String str1 = String.valueOf(charArray);


        // Print the string
        System.out.println("The string is: " + str);

    }
}
