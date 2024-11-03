package collectionsFramework.CollectionExample;

public class Student {
     int age;
     String name;
     String grade;

    // Constructor
    public Student(int age, String name, String grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
