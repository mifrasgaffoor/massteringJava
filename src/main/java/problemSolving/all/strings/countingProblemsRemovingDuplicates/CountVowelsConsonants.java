package problemSolving.all.strings.countingProblemsRemovingDuplicates;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";

        int vowelsCnt=0;
        int constCnt=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i)  == 'e' || str.charAt(i)  == 'i' || str.charAt(i)  == 'o' || str.charAt(i)  == 'u') {
                vowelsCnt++;
            } else if (str.charAt(i)  >= 'a' && str.charAt(i)  <= 'z') {
                constCnt++;
            }
        }
        System.out.println(vowelsCnt);
        System.out.println(constCnt);
    }
}
