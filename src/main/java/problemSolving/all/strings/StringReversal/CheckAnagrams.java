package problemSolving.all.strings.StringReversal;

import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str = "listen";
        String str1 = "silent";

        // if there any space have to remove i t
        String strs = "listen   ";
        String str1s = "    silent";

        strs =strs.replace(" ","");
        System.out.println(strs);
        str1s =str1s.replace(" ","");
        System.out.println(str1s);

        // Convert strings to character arrays and sort them
        char[] a = str.toCharArray();
        Arrays.sort(a);
        char[] b = str1.toCharArray();
        Arrays.sort(b);

        // Print sorted arrays for debugging purposes (optional)
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // Check if sorted arrays are equal
        if (Arrays.equals(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
