package collectionsFramework.comparatorInterface;

public class Person {
    int age ;
    String name ;

    Person(int age , String name){
        this.age =age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "{"+ name + " " + age + " " +"}";
    }


}
