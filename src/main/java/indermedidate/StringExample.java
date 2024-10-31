package indermedidate;

public class StringExample {
    public static void main(String[] args) {

        // Create String
        String name = "Nimal";
        String n = "nimal";
        String name2 = new String("Hello");

        String space = " spacce";

        // String Methods

        System.out.println(name2.length());  // length
        System.out.println(name2.concat("World")); // concat
        System.out.println(name2.concat("test").concat("hi")); // concat
        System.out.println(name.toUpperCase()); // toUpperCase
        System.out.println(space);
        System.out.println(space.trim()); // trim
        System.out.println(name2.indexOf(0)); // search
        System.out.println(name2.charAt(3));  // char return
        System.out.println(name2.contains("fal")); //contains

        System.out.println(name.equals(n)); //equals
        System.out.println(name.equalsIgnoreCase(n)); //equalsIgnoreCase

        System.out.println(n.replace('n','m')); //replace

        System.out.println(n.replaceAll("nimal","mifras")); //re    placeAll

        System.out.println(name.substring(0,3)); // substring



        String email = "mif@gmail.com";
        String[] arr = email.split("@");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String s1 = "my";
        String s2 = "my";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        String s3 = new String("my");

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        String s4 = s3 ;
        System.out.println("---------------");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));







    }



}
