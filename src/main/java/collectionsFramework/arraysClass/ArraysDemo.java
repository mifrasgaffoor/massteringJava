package collectionsFramework.arraysClass;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {11, 2, 3, 4, 5};

        boolean areSame  = true;
        if (array1.length!=array2.length){
            areSame =false;
            return;
        }else {
            for (int i = 0; i < array1.length ; i++) {
                if (array1[i] != array2[i]){
                    areSame =false;
                    break;
                }
            }
        }

        if (areSame){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(Arrays.equals(array1,array2));
    }
}
