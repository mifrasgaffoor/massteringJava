package problemSolving.all.strings.StringReversal;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str  = "madam";
        char[] c = str.toCharArray();
        String newStr ="";
        for (int i = c.length-1; i >=0; i--) {
            newStr =newStr+c[i];
        }

        if (str.equals(newStr)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not");
        }
    }
}
