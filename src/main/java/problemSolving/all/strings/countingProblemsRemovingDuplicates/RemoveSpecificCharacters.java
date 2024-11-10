package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class RemoveSpecificCharacters {
    public static void main(String[] args) {
        String str = "Hello World 123!";

        System.out.println("Original string: " + str);
        System.out.println("Without vowels: " + removeVowels(str));
        System.out.println("Without digits: " + removeDigits(str));
        System.out.println("Without specific characters ('l', 'o'): " + removeSpecificCharacters(str, "lo"));
    }

    // Method to remove vowels
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Method to remove digits
    public static String removeDigits(String str) {
        return str.replaceAll("[0-9]", "");
    }

    // Method to remove specific characters based on a given pattern
    public static String removeSpecificCharacters(String str, String charsToRemove) {
        String pattern = "[" + charsToRemove + "]";
        return str.replaceAll(pattern, "");
    }
}
