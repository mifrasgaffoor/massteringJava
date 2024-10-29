package problemSolving.patterns;

public class RightDownMirrorStar {


    /*

     *****
      ****
       ***
        **
         *
  
      */



    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
