package problemSolving.arrays;

public class ArrayPalindrome {

    public static void main(String[] args) {
        int[] arr = { 1,22,3,2,1};
        ArrayPalindrome.checkPalindrome(arr);


    }


    static void checkPalindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
           if (arr[start] !=arr[end]){
               System.out.println("Not Palndarome");
               return;
           }
           start++;
           end--;

        }
        System.out.println("Palindrome");
    }
}
