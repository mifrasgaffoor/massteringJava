package problemSolving.stringsAndChar;

public class PrintVowels {
    public static void main(String[] args) {
        String name ="This is My Name";
        for (int i = 0; i < name.length() ; i++) {

            char c = name.charAt(i);
            char lower  = Character.toLowerCase(c);

            if (lower=='a' ||lower=='e' ||lower=='i' || lower=='o' ||lower=='u'){
                System.out.println(lower);
            }
        }

    }
}
