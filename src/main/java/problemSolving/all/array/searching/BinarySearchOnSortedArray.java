package problemSolving.all.array.searching;

public class BinarySearchOnSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};

        int ans = BinarySearchOnSortedArray.binarySearchOnSortedArray(arr, 5);
        System.out.println(ans);  // Output should be the index of 5, which is 3
    }

    public static int binarySearchOnSortedArray(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {  // Use start <= end to check the last element
            int mid = (start + end) / 2;
            if (arr[mid] == n) {
                return mid;  // Target found
            } else if (arr[mid] < n) {
                start = mid + 1;  // Search right half
            } else {
                end = mid - 1;  // Search left half
            }
        }
        return -1;  // Element not found
    }
}
