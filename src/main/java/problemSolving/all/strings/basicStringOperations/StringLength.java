package problemSolving.all.strings.basicStringOperations;

public class StringLength {
    public static void main(String[] args) {
        String str = "mifras";

       // without using in-built methods
        String strNew = str.concat("\0");
        char[] c = strNew.toCharArray();
        int i = 0;
        int count = 0;
        while (strNew.charAt(i) != '\0') {
            count++;
            i++; // Increment i to move to the next character
        }
        System.out.println(count);

        // using method
        System.out.println(str.length());

    }
}
