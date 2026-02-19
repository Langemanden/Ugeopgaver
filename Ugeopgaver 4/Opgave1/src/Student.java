

public class Student {
    String name;
    int age;
    String studentId;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void printInfo() {
        System.out.println(name + " er " + age + " år");
        if (studentId != null) {
            System.out.println("  ID: " + studentId);
        }
    }
}
