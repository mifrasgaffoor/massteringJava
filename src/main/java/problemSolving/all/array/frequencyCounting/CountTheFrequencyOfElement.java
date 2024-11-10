package problemSolving.all.array.frequencyCounting;

public class CountTheFrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {23, 3, 4, 5, 6, 7, 3, 7};
        countTheFrequencyOfElement(arr);
    }

    public static void countTheFrequencyOfElement(int[] arr) {
        boolean[] counted = new boolean[arr.length]; // Array to keep track of counted elements

        for (int i = 0; i < arr.length; i++) {
            // Skip if this element has already been counted
            if (counted[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true; // Mark duplicates as counted
                }
            }

            // Print the result for arr[i]
            System.out.println(arr[i] + " occurs " + count + " times.");
        }
    }
}
