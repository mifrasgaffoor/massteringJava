package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class SpecificCharacterCount {
    public static void main(String[] args) {
        String str = "Hello World!";
        char c = 'l';
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='l'){
                count++;
            }
        }
        System.out.println("count for l is : " +count);
    }
}
