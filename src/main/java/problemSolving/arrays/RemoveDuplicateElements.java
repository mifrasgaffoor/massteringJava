package problemSolving.arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 4};
        RemoveDuplicateElements.removeDuplicate(arr);
    }

    static void removeDuplicate(int[] arr) {
        int replace = 0;

        // Remove duplicates by marking them as 'replace' (here, set to 0)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != replace) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = replace;
                    }
                }
            }
        }

        // Print unique elements only (ignoring replaced elements)
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != replace) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
