package problemSolving.all.array;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {23,34,4,5};

        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max =arr[i];
            }
        }

        System.out.println("max : " + max);
    }




}
