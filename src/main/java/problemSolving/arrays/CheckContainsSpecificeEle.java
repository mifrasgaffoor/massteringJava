package problemSolving.arrays;

public class   CheckContainsSpecificeEle {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int num = 31;
        checkEle(arr, num);
    }


    static void checkEle(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Yes");
                return;  // Exit method if the element is found
            }
        }
        System.out.println("No");  // Print "No" only if element is not found in the array
    }
}
