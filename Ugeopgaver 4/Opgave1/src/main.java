public class main {

    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }
        return oldest;
    }

    public static Student findById(Student[] students, String id) {
        for (Student s : students) {
            if (s.studentId != null && s.studentId.equals(id)) {
                return s;
            }
        }
        return null;
    }

    void main() {
        Student s1 = new Student("Sofus", 25);
        Student s2 = new Student("Ronaldo", 41);
        Student s3 = new Student("Cecilie", 26);

        Student[] students = {s1, s2, s3};

        System.out.println("Alle studerende:");
        for (Student s : students) {
            s.printInfo();
        }

        Student oldest = findOldest(students);
        System.out.println("\nÆldste studerende:");
        oldest.printInfo();

        System.out.println("\n=== Med student ID ===");
        Student st1 = new Student("Sofus", 25, "S001");
        Student st2 = new Student("Ronaldo", 41, "S002");
        Student st3 = new Student("Cecilie", 26, "S003");

        Student[] studentsWithId = {st1, st2, st3};

        Student found = findById(studentsWithId, "S002");
        if (found != null) {
            System.out.println("Fundet studerende med ID S002:");
            found.printInfo();
        }
    }
}

