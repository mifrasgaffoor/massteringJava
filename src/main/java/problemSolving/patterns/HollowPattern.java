package problemSolving.patterns;

public class HollowPattern {

    /*

     * * * * *
     *       *
     *       *
     *       *
     * * * * *

     */

    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) { // Corrected loop condition
            for (int j = 0; j < n; j++) { // Corrected loop condition
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Add extra space for alignment
                }
            }
            System.out.println(); // New line at the end of each row
        }
    }
    }



