package problemSolving.stringsAndChar;

public class PrintEachCharOfString {
    public static void main(String[] args) {

        String name ="Its my name";

        for (int i = 0; i < name.length() ; i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }

    }



}
