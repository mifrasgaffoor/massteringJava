package problemSolving.all.array;

public class CheckPalindrome {

    public static void main(String[] args) {
        int[] arr = {23,34,4,5};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr.length-1; j >=0 ; j--) {
                if (arr[i]==arr[j]){
                    System.out.println("Palindrome");
                    i++;
                    j--;
                    break;
                }
            }
        }
    }
}
