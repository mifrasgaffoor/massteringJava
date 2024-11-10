package problemSolving.all.array;

public class PrintSum {
    public static void main(String[] args) {
        int[] arr = {23,34,4,5};

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum:" + sum);
    }


}
