package problemSolving.stringsAndChar;

public class CountLowerUpperCase {
    public static void main(String[] args) {
        int countUpper = 0;
        int countLower = 0;
        String name ="Its my name";
        for (int i = 0; i <name.length() ; i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)){
                countUpper++;
            }
            if (Character.isLowerCase(c)){
                countLower++;
            }

        }
        System.out.println("LowerCount : " + " " + countLower);
        System.out.println("UpperrCount : " + " " + countUpper);
    }
}
