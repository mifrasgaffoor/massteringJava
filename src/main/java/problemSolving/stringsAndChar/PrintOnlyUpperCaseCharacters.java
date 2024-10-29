package problemSolving.stringsAndChar;

public class PrintOnlyUpperCaseCharacters {

    public static void main(String[] args) {
        String name ="This is My Name";
        for (int i = 0; i <name.length() ; i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)){
                System.out.println(c);
            }
        }
    }

}
