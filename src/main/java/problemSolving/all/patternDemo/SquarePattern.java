package problemSolving.all.patternDemo;

public class SquarePattern {
    public static void main(String[] args) {
        /*

         *****
         *****
         *****
         *****
         *****
         */

        /*

       1 1 1 1
       2 2 2 2
       3 3 3 3
       4 4 4 4

        * */


        SquarePattern.print1(5);
        System.out.println();
        SquarePattern.print2(5);


    }

    public static  void print1(int n){
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void print2(int n){
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(i+ " ");

            }
            System.out.println();
        }
    }
}
