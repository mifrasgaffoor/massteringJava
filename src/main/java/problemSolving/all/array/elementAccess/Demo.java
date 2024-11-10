package problemSolving.all.array.elementAccess;

public class Demo {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "orange", "graphs"};
        // Access Array Elements Using Indices
        System.out.println( arr[0]);
        //Access Elements in Reverse Order**

        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[arr.length-3]);

        //Access First and Last Element
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        //Modify Elements Using Indices
        arr[0]="redapple";

        //Access a Specific Range of Elements Using Indices
        for (int i = 2; i < arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }

    }
}
