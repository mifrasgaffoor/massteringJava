package problemSolving.patterns;

public class ReversedPyramidStar {
    /*

     * * * * *
      * * * *
       * * *
        * *
         *

     */

    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            // Print stars with spaces between them
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
