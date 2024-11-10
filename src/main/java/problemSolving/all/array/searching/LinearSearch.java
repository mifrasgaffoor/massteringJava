package problemSolving.all.array.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,3,5,6,34,67};
        int ans = LinearSearch.LinearSearch(arr,3);
        System.out.println("Index is :"+ans);
    }

    public static int LinearSearch(int[] arr ,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
