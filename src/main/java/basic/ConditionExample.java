package basic;

public class ConditionExample {
    public static void main(String[] args) {

        // if  else condition
        boolean isMarried = true;
        if (isMarried==true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        // else-if ladder
        int score = 85 ;
        if (score > 80) {
            System.out.println("MacBook");
        } else if (score > 65) {
            System.out.println("iPhone");
        } else if (score > 35) {
            System.out.println("Video game");
        } else {
            System.out.println("No item"); // Optional else for scores 35 or below
        }

        // switch

        String day = "Tuesday";

        switch (day){
            case "Monday":
                System.out.println("Hi");
                break;
            case "Tuesday":
                System.out.println("No");
                break;
            default:
                System.out.println("Wrong");
        }

    }
}
