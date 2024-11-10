package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class CountConsecutiveRepetitions {
    public static void main(String[] args) {
        String str = "aaabbcccaa";
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
        }
        System.out.println("Consecutive repetitions: " + count);
    }
}