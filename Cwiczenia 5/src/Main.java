import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Deanery deanery = new Deanery();

        StudyProgramme it = new StudyProgramme("IT", "TEM", 7, 5);
        StudyProgramme cs = new StudyProgramme("Computer Science", "MIK", 8, 4);

        Student s1 = new Student("Ewa", "Zianewicz", "s31503@pjwstk.edu.pl", "Warsaw, Zlota 12", "333-322-222", new Date(2003, 3, 11));
        Student s2 = new Student("David", "Fincher", "david@wp.pl", "Krakow, Market 10", "444-333-111", new Date(1962, 8, 28));

        s1.enrollStudent(it);
        s2.enrollStudent(cs);

        s1.addGrade(5, "PGO");
        s1.addGrade(2, "APBD");

        s2.addGrade(4, "Algorithms");
        s2.addGrade(3, "Data Structures");

        deanery.addStudent(s1);
        deanery.addStudent(s2);

        deanery.promoteAllStudents();
        deanery.displayInfoAboutAllStudents();
    }
}
