package problemSolving.arrays;

public class SumAllElements {


    public static void main(String[] args) {
        int[] arr ={23,3,4,5};
        int ans = SumAllElements.sumEle(arr);
        System.out.println(ans);
    }


    static int sumEle(int[] arr){
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            sum =sum +arr[i];
        }
        return sum;
    }
}
