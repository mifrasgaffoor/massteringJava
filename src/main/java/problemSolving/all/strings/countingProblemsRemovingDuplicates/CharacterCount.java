package problemSolving.all.strings.countingProblemsRemovingDuplicates;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World!";
       String newStr =  str.replace(" ","");
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < newStr.length(); i++) {
            char c = newStr.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else {
                hm.put(c, 1);
            }
        }

        // Print character counts
        for (Character key : hm.keySet()) {
            System.out.println(key + ": " + hm.get(key));
        }




    }
}
