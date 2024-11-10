package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class CountWords {
    public static void main(String[] args) {
        String sentence = "Hello, how are you?";
        String[] newStr = sentence.trim().split("\\s");
        System.out.println(newStr.length);

    }
}
