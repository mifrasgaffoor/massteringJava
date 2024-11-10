package problemSolving.all.strings.StringReversal;

public class CopyToAnotherString {
    public static void main(String[] args) {
        // Copy String to New String
    String  str = "mifras";
    char[] ch = str.toCharArray();
    String newStr ="";
        for (int i = 0; i<ch.length ;i++) {
            newStr = newStr+ch[i];
        }
        System.out.println(newStr);
    }

}
