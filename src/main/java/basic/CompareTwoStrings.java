package basic;

public class CompareTwoStrings {
    public static void main(String[] args) {

        String s1 = "apple";
        String s2 = "apple";
        System.out.println(s1 ==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("apple");
        String s4 = new String("apple");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
