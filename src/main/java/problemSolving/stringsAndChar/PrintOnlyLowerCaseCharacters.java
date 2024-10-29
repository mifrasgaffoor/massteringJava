package problemSolving.stringsAndChar;

public class PrintOnlyLowerCaseCharacters {
    public static void main(String[] args) {
        String name ="This is My Name";
        for (int i = 0; i <name.length() ; i++) {
            char c = name.charAt(i);
            if (Character.isLowerCase(c)){
                System.out.println(c);
            }
        }
    }
}
