package problemSolving.all.strings.substringOperations;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueSubstrings {

    public static void main(String[] args) {
        String str = "abca";
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
              hs.add(  str.substring(i,j));
            }
        }
        System.out.println(hs);
    }



}
