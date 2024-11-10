package problemSolving.all.strings.countingProblemsRemovingDuplicates;

import java.util.LinkedHashSet;

public class RemoveAllDuplicates {
    public static void main(String[] args) {
        String str = "Hello World!";
        LinkedHashSet<Character> hs = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i)); // Add each character to LinkedHashSet
        }

        // Print unique characters in the original order
        System.out.print("Unique characters: ");
        for (Character c : hs) {
            System.out.print(c);
        }
    }
}