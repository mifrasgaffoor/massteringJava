package problemSolving.arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {3,4,5};
        ReverseArray.revArr(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }

    }



     static  void revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
         for (int i = 0; i < arr.length; i++) {
             while (start<end){
                 int temp = arr[start];
                 arr[start] = arr[end];
                 arr[end] =temp;
                 start++;
                 end--;
             }
         }
    }
}
