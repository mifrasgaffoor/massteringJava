package dsa.dataStructures.Arrays;

public class ArrayInsertOperations {
    public static void main(String[] args) {

        // Insertion At the End
        int[] arr = {23,4,5}; // Need to insert 45 in last
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i <newArr.length-1 ; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1] = 45;
        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i] +" ");
        }

        System.out.println();


        // Insertion At the Start

       int[] arr1 = {23,3,4};

       int[] newArr1 = new int[arr1.length+1]; // 4

        for (int i = 0; i <newArr1.length-1; i++) {
            newArr1[i+1] =arr1[i];
        }

        newArr1[0] = 53 ;

        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr1[i] + " ");
        }

        System.out.println();
        // At a Specific Position

        int pos = 2 ;
        int[] arr3 = {23,3,4};
        int[] newArr3 = new int[arr3.length+1];  // insert in 2nd posstion

        for (int i = 0; i < pos; i++) {
            newArr3[i] =arr3[i];
        }

        newArr3[pos] = 56;
        for (int i = pos+1; i <newArr3.length ; i++) {
            newArr3[i]= arr1[i-1];
        }

        for (int i = 0; i <newArr3.length ; i++) {
            System.out.print(newArr3[i] +" ");
        }




    }

}
