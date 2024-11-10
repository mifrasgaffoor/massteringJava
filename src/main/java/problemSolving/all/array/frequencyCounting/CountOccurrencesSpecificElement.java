package problemSolving.all.array.frequencyCounting;

public class CountOccurrencesSpecificElement {
    public static void main(String[] args) {
        int[] arr  ={23,3,4,5,6,23,3};
       int ans= CountOccurrencesSpecificElement.countOccurrencesSpecificElement(arr,4);
        System.out.println(ans);
    }


    public  static  int countOccurrencesSpecificElement(int[] arr,int n){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == n){
                count++;
            }
        }
        return count;
    }
}
