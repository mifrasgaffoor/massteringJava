package dsa.dataStructures.Arrays;

public class ArraySearchOperations {
    public static void main(String[] args) {

        int[] arr1 = {23,4,5,3};
       int pos =  ArraySearchOperations.linearSearch(arr1,23);
       System.out.println(pos);

        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 17;
        int result = ArraySearchOperations.binarySearch(arr, target);
        System.out.println(result);
    }



     static int  linearSearch(int[] arr , int ele){
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] ==ele){
                 return i;
             }
         }
         return -1;
    }




    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1; // 5
        while (start <= end) {
            int mid = (start + end ) / 2; // Corrected way to calculate mid
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }






}
