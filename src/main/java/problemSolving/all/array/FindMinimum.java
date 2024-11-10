package problemSolving.all.array;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {23,34,4,5};
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min : " +min);
    }



}
