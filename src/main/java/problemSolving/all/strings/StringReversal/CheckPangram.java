package problemSolving.all.strings.StringReversal;

public class CheckPangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.replace(" ","");
        boolean ans = false;
        System.out.println(str);
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length ; i++) {
            if (a[i] >= 'a' && a[i] <= 'z'){
                ans =true;
                return;
            }
        }
        if (ans){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
    }

}
