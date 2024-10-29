package problemSolving.arrays;

public class FindMax {

    public static void main(String[] args) {


        int[] arr ={23,34,5,6};

        int ans = FindMax.findMax(arr);
        System.out.println(ans);

    }



     static  int  findMax(int[] arr){


        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max =arr[i];
            }
        }
        return max;

    }
}


