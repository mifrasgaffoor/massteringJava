package problemSolving.all.strings.StringReversal;

public class ReverseString {
    public static void main(String[] args) {
        String str = "apple";
        String newStr = "";
        char[] c = str.toCharArray();
        for (int i = c.length-1; i >=0 ; i--) {
            newStr=newStr+c[i];
        }

        System.out.println("Before Reverse : " + str);
        System.out.println("After Reverse : " + newStr);
    }
}
