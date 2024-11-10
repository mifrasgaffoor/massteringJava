package problemSolving.all.patternDemo;

public class LeftTrianglePatternNumber {

    /*

    c.      *
            **
            ***
            ****
            *****

    d.      1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
            6 6 6 6 6 6

            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
            0 1 0 1 0 1

     */


    public static void main(String[] args) {
        LeftTrianglePatternNumber.p1(5);
        LeftTrianglePatternNumber.p2(5);
        LeftTrianglePatternNumber.p3(5);
        LeftTrianglePatternNumber.p4(5);
    }




    public static void p1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void p4(int n) {
        for (int i = 1; i <= n; i++) {
            int startValue = i % 2;  // Start with 1 if i is odd, 0 if i is even
            for (int j = 1; j <= i; j++) {
                System.out.print(startValue + " ");
                startValue = 1 - startValue;  // Toggle between 1 and 0
            }
            System.out.println();
        }
    }




    public static void p(int n){
        for (int i = 1; i <=n ; i++) {

            int s = i % 2;
            for (int j = 0; j <= i ; j++) {
                System.out.print(s+" ");
                s = s-1;
            }
        }
    }




}
