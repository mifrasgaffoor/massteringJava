package problemSolving.all.patternDemo;

public class LeftBottomTrianle {
    /*

  g.* * * * *
    * * * *
    * * *
    * *
    *

h.  5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1

i.  1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1




    * */
    public static void main(String[] args) {
        LeftBottomTrianle.p(5);
        LeftBottomTrianle.p2(5);
        LeftBottomTrianle.p4(5);
    }

    public  static void  p(int n){
        for (int i = 1; i<=n ; i++) {
            for (int j = n; j>=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public  static void p2(int n){
        for (int i = n; i >= 1; i--) {  // Start from n and decrease to 1
            for (int j = 1; j <= i; j++) {  // Print the current row number i times
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void p4(int n) {
        for (int i = n; i >= 1; i--) {  // Start from n and decrease to 1
            for (int j = 1; j <= i; j++) {  // Print numbers from 1 to i
                System.out.print(j + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
