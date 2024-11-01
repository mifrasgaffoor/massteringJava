package dsa.dataStructures.Arrays;

public class ArrayDeleteOperations {
    public static void main(String[] args) {

        // From the End: Removes the last element.

        int[] arr = {23,4,5,6,7};
        int[] newArr = new int[arr.length-1];

        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i] +" ");
        }

        System.out.println();

        // From a Specific Position


        int pos = 3 ;

        int[] arr1 = {2,3,4,5,6,7}; // 5 need to be delete
        int[] newArr1 = new int[arr1.length-1];

        for (int i = 0; i <pos ; i++) {
            newArr1[i] =arr1[i] ;
        }

        for (int i = pos+1; i < arr1.length; i++) {
            newArr1[i-1]=arr1[i];
        }

        for (int i = 0; i <newArr1.length ; i++) {
            System.out.print(newArr1[i]+" ");
        }

        System.out.println();


        // Delete in start

        int[] arr2 = {23,4,4,5,6};
        int[] newArr2 = new int[arr2.length - 1];

        for (int i = 0; i <arr2.length-1 ; i++) {
            newArr2[i] =arr2[i+1];
        }

        for (int i = 0; i <newArr2.length ; i++) {
            System.out.print(newArr2[i]+" ");
        }





    }


}
