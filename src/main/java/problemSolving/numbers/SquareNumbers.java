package problemSolving.numbers;

public class SquareNumbers {
    public static void main(String[] args) {

        SquareNumbers squareNumbers = new SquareNumbers();
        int ans = squareNumbers.squareFun(2);
        System.out.println(ans);
    }


    int squareFun(int a){
      return  a*a;
    }
}
