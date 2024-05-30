import java.util.HashMap;
import java.util.Map;

public class Student {
    private static int studentCounter = 0;

    private String studentNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private String status;
    private Map<String, Integer> grades; // Map to store subject and grade

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.studentNumber = "s" + (++studentCounter);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.currentSemester = 1;
        this.status = "kandydat";
        this.grades = new HashMap<>();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.status = "student";
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addGrade(int grade, String subject) {
        grades.put(subject, grade);
    }

    public int getITNs() {
        int itnCount = 0;
        for (int grade : grades.values()) {
            if (grade < 3) {
                itnCount++;
            }
        }
        return itnCount;
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters() && getITNs() <= studyProgramme.getMaxITNs()) {
            currentSemester++;
            if (currentSemester == studyProgramme.getNumberOfSemesters()) {
                status = "absolwent";
            }
        }
    }

    public void displayInfo() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Study Programme: " + studyProgramme.getName());
        System.out.println("Current Semester: " + currentSemester);
        System.out.println("Status: " + status);
        System.out.println("Grades: " + grades);
    }
}
