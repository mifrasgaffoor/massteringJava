package problemSolving.all.strings.caseManipulation;

public class ToggleCase {
    public static void main(String[] args) {
        String str ="Mifras hi HOW arE YoU";

        // Initialize a StringBuilder to store the result
        StringBuilder toggledStr = new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            }
            // If it's neither (such as space or punctuation), leave it unchanged
            else {
                toggledStr.append(ch);
            }
        }
        System.out.println("Toggled Case: " + toggledStr.toString());
    }
}
