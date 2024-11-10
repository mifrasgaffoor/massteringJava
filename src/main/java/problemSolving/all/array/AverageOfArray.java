package problemSolving.all.array;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {23,34,4,5};
        int a = arr.length;
        int sum  = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum+arr[i];
        }

        int ans = sum/a;
        System.out.println("AVG : "+ans);
    }



}
