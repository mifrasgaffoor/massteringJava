package problemSolving.all.array.lengthAndProperties;

public class Length2DArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (3 rows, 4 columns)
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Get the number of rows (length of the 2D array)
        int rows = arr.length;
        System.out.println("Number of rows: " + rows);

        // Get the number of columns (length of the first row)
        int columns = arr[0].length;
        System.out.println("Number of columns in the first row: " + columns);

        // Loop through the 2D array to print the elements and their positions
        System.out.println("\nArray elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }

    }
}
