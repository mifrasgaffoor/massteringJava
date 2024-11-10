package problemSolving.all.strings.basicStringOperations;

public class RetrieveCharacterAtSpecificIndex {
    public static void main(String[] args) {
        String str = "apple";

        // using charAt()
        System.out.println(str.charAt(0));

        char[] c = str.toCharArray();
        System.out.println(c[3]);


    }
}
