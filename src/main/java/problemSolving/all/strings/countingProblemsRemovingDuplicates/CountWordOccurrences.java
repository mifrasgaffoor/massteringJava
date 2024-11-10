package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class CountWordOccurrences {
    public static void main(String[] args) {
        String str = "Hello World! How Are you";
        String[] newStr = str.trim().split("\\s");
        System.out.println(newStr.length);
    }
}
