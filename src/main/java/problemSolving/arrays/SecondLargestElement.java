package problemSolving.arrays;

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int sizeN = scanner.nextInt();

        if (sizeN < 2) {
            System.out.println("Array size must be at least 2 to find the second largest element.");
            return;
        }

        int[] arr = new int[sizeN];

        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // Descending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array (optional, for debugging)
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the second largest element
        int secondLargest = arr[1]; // After sorting, second-largest element will be at index 1
        System.out.println("The second largest element is: " + secondLargest);
    }
}
