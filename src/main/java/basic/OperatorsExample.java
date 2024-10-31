package basic;

public class OperatorsExample {
    public static void main(String[] args) {
        int a  = 3 ;
        int b = 4 ;

        // Arithmetic - + * / % -
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/2);
        System.out.println(a*b);
        System.out.println(a%b);

        // Conditaionl Operator  < >  <=  >=   == = !=

        if (a > b) {
            // Action if a is greater than b
            System.out.println("a is greater than b");
        }

        if (b > a) {
            // Action if b is greater than a
            System.out.println("b is greater than a");
        }

        if (a == b) {
            // Action if a is equal to b
            System.out.println("a is equal to b");
        }

        if (a != b) {
            // Action if a is not equal to b
            System.out.println("a is not equal to b");
        }

        if (a >= b) {
            // Action if a is greater than or equal to b
            System.out.println("a is greater than or equal to b");
        }

        if (a <= b) {
            // Action if a is less than or equal to b
            System.out.println("a is less than or equal to b");
        }


        // Logical Operator  && || !

        if (a < b || a > b) {
            // Action if a is either less than b or greater than b (always true if a != b)
            System.out.println("a is not equal to b");
        }

        if (a < b && a > b) {
            // This condition is impossible (contradictory)
            // Action if a is both less than and greater than b (never true)
            System.out.println("This condition is impossible");
        }

        if (a != b) {
            // Action if a is not equal to b
            System.out.println("a is not equal to b");
        }


        // Bitwise &, |, ^, ~, <<, >>, >>>
        System.out.println(5 & 3); // Bitwise AND
        System.out.println(5 | 3); //  Bitwise OR
        System.out.println(5 ^ 3);  // Bitwise XOR (^)
        System.out.println(~5); // Bitwise NOT (~);
        System.out.println(5 << 1); // Left Shift (<<)
        System.out.println(5 >> 1); //Right Shift (>>)
        System.out.println(-5 >>> 1); //Unsigned Right Shift (>>>)



        // Increment and Decrement Operators  ++ --

        /*
        Post-increment (a++): Use the value before increasing it.
        Pre-increment (++a): Increase the value before using it.
        Post-decrement (b--): Use the value before decreasing it.
        Pre-decrement (--b): Decrease the value before using it.
        */

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);


    }
}
