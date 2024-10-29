package problemSolving.stringsAndChar;

public class PrintAsciiCode {
    public static void main(String[] args) {
        String name ="This is My Name";
        for (int i = 0; i < name.length() ; i++) {
            char c = name.charAt(i);
            int ascii = (int) c;
            System.out.println(c + "-" + ascii);
        }
    }

}
