package problemSolving.all.patternDemo;

public class RightTopTriangle {
    /*

         *
        **
       ***
      ****
     *****

     *****
      ****
       ***
        **
         *

   */

    public static void main(String[] args) {
        RightTopTriangle.p(5);
        RightTopTriangle.p2(5);
    }

    public static void p(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces for right alignment
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }


    public static void p2(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

}
