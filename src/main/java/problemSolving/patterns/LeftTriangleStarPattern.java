package problemSolving.patterns;

public class LeftTriangleStarPattern {
    /*

           *
         * *
       * * *
     * * * *


     */

    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 0; i <n ; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }
            // Print stars with spaces in between
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
