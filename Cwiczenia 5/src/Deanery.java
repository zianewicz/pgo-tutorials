import java.util.ArrayList;
import java.util.List;

public class Deanery {
    private List<Student> students;

    public Deanery() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public void displayInfoAboutAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }
}
