package Student;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Student s1 = new Student("Nam", 20, 9);
        Student s2 = new Student("Ha", 21, 9.5f);
        Student s3 = new Student("Linh", 19, 8f);
        Student s4 = new Student("Trinh", 22, 10f);
        Student s5 = new Student("Trinh", 19, 5f);
        
        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);
        studentManager.addStudent(s5);

        studentManager.sortByAge();
        studentManager.printAllStudent();
        studentManager.sortByName();
        studentManager.sortByPoint();
        studentManager.findStudentByName("Linh");
        studentManager.sortByNameAndAge();
    }
    
}
