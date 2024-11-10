package problemSolving.all.array;

public class CheckspecificElement {
    public static void main(String[] args) {
        int[] arr = {23,34,4,5};
        CheckspecificElement.checkEle(arr,23);

    }

    public  static void checkEle(int[] arr ,int n){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == n){
                System.out.println("Yes");
                break;
            }
            System.out.println("NO");
        }
    }
}
