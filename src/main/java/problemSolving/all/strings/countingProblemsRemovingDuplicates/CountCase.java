package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class CountCase {
    public static void main(String[] args) {
        String str = "Hello World!";

        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)<='Z' && str.charAt(i)>='A'){
                countUpper++;
            }
            else {
                countLower++;
            }
        }
        System.out.println("UpperCase : "+countUpper);
        System.out.println("LowerCase : "+countLower);
    }
}
