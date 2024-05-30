import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
    private String name;
    private List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        if (grades.size() < 20) {
            grades.add(grade);
        } else {
            throw new IllegalStateException("Student cannot have more than 20 grades.");
        }
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("No grades available for student " + name);
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return roundGrade(average);
    }

    private double roundGrade(double average) {
        double[] possibleGrades = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        double closestGrade = possibleGrades[0];
        double minDifference = Math.abs(average - possibleGrades[0]);

        for (double grade : possibleGrades) {
            double difference = Math.abs(average - grade);
            if (difference < minDifference) {
                minDifference = difference;
                closestGrade = grade;
            }
        }

        return closestGrade;
    }
}

class StudentGroup {
    private Set<Student> students;

    public StudentGroup() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Cannot add more than 15 students to the group.");
        }
        if (!students.add(student)) {
            throw new IllegalStateException("Student " + student.getName() + " is already in the group.");
        }
    }

    public double calculateGroupAverage() {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students in the group.");
        }

        double sum = 0;
        int count = 0;

        for (Student student : students) {
            sum += student.calculateAverage();
            count++;
        }

        double average = sum / count;
        return roundGrade(average);
    }

    private double roundGrade(double average) {
        double[] possibleGrades = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        double closestGrade = possibleGrades[0];
        double minDifference = Math.abs(average - possibleGrades[0]);

        for (double grade : possibleGrades) {
            double difference = Math.abs(average - grade);
            if (difference < minDifference) {
                minDifference = difference;
                closestGrade = grade;
            }
        }

        return closestGrade;
    }
}
