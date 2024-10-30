package problemSolving.numbers;

public class FibonacciSeries {
    // 0 1 1 2 3 5
    public static void main(String[] args) {

        int n = 9 ;
        int firstNum = 0 ;
        int secndNum = 1 ;

        for (int i = 1; i <= n; i++) {

            System.out.print(firstNum + ",");
            int thridNum = firstNum +secndNum;
            firstNum = secndNum;
            secndNum = thridNum ;

        }
    }
}
