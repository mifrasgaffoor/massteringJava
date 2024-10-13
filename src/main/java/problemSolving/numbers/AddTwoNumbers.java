package problemSolving.numbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
       int sum = addTwoNumbers.addTwoNum(23,34);
        System.out.println("Sum is : " + " " + sum);
    }

    int addTwoNum(int a , int b ){
        return a+b;
    }
}
