package problemSolving.arrays;

import java.util.Arrays;

public class CountEvenOdd {

    public static void main(String[] args) {
        int[] a = {2,3,4};
        int[] aa = CountEvenOdd.CountEvenOdd(a);
        System.out.println(Arrays.toString(aa));
    }


    static int[] CountEvenOdd(int[] a){

        int oddCount = 0;
        int evenCout =0;

        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2==0){
                evenCout++;
            }
            if (a[i]%2==1){
                oddCount++;
            }
        }
        return new  int[]{oddCount,evenCout};
    }

}
