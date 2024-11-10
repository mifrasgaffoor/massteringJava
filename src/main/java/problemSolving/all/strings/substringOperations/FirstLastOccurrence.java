package problemSolving.all.strings.substringOperations;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int firstIndex = str.indexOf("World");
        int lastIndex = str.lastIndexOf("World");

        System.out.println("First occurrence of 'World': " + firstIndex);
        System.out.println("Last occurrence of 'World': " + lastIndex);
    }
}
