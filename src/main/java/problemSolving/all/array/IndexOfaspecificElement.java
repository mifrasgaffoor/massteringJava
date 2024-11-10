package problemSolving.all.array;

public class IndexOfaspecificElement {
    public static void main(String[] args) {
        int[] arr = {23,34,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==4)
            {
                System.out.println("Index is : "+i);
                break;
            }
        }
    }
}
