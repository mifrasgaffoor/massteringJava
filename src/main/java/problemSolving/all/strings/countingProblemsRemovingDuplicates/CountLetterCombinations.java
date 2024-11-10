package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class CountLetterCombinations {
    public static void main(String[] args) {
        String str = "abcabcabc";
        String target = "ab";
        int count = 0;
        for (int i = 0; i <= str.length() - target.length(); i++) {
            if (str.substring(i, i + target.length()).equals(target)) {
                count++;
            }
        }

    }
}
