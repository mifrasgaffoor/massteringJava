package dsa.dataStructures.Arrays;

public class ArraySortingOperations {
    public static void main(String[] args) {
        int[] arr = {130,10,250,23};
       // ArraySortingOperations.bubbleSort(arr);
       // ArraySortingOperations.selectionSort(arr);
        ArraySortingOperations.insertionSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }



    }


    static  void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static  void selectionSort(int[] arr){
        int smallest;
        for (int i = 0; i < arr.length ; i++) {
            smallest=arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    smallest =arr[j];
                    arr[j]=arr[i];
                    arr[i]=smallest;
                }
            }
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; 0< j ; j--) {
                if (arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }
}
