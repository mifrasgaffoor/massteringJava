package problemSolving.arrays;

public class AvgOfElements {
    public static void main(String[] args) {
        int[] arr ={3,3,3};
        int avg = AvgOfElements.findAvg(arr);
        System.out.println(avg);
    }


    static int findAvg(int[] arr){

        int sum = 0;
        int eleCount = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }

        int avg = sum/eleCount;
        return avg;
    }


}
