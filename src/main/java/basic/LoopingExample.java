package basic;

public class LoopingExample {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }

        // while

       int count = 1;
//        while (count <= 5){
//            System.out.println("Iteration " + count);
//            count++;
//        }


        // do-while


        do {
            System.out.println("Iteration " + count);
            count++;
        }while (count <= 10 );


    }
}
