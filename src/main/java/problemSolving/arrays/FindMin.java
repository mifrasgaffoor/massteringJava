package problemSolving.arrays;

public class FindMin {
    public static void main(String[] args) {

        int[] arr ={2,3,4,5};
        int ans = FindMin.findMin(arr);
        System.out.println(ans);
    }


    static  int findMin(int[] arr){
        int min = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < min){
                min =arr[i];
            }

        }
        return min;
    }
}
