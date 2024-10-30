package problemSolving.numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 11 ;
        boolean isPrime =  true;
        if (n < 2){
            System.out.println("NOT PRIME");
            return;
        }else {
            for (int i = 2; i < n ; i++) {
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println("Yes Prime");
        }
        else {
            System.out.println("No Prime");
        }
    }
}
