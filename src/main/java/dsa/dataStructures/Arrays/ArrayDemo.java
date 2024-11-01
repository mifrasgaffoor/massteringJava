package dsa.dataStructures.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Declaration a array
        int[] arr;

        // Initialization the array
        arr = new int[]{23, 3, 4, 5};

        //  Accessing Elements
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // Array Length
        System.out.println(arr.length);

        // Looping Through Arrays
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Array Methods



        //  Multidimensional Arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};



    }
}
