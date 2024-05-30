public class Onemore {
        public static void main(String[] args) {
            Student s1 = new Student("Ewa");
            s1.addGrade(3.0);
            s1.addGrade(4.0);

            Student s2 = new Student("Marcin");
            s2.addGrade(5.0);
            s2.addGrade(4.5);

            StudentGroup group = new StudentGroup();
            group.addStudent(s1);
            group.addStudent(s2);

            System.out.println("Ewa's average: " + s1.calculateAverage());
            System.out.println("Marcin's average: " + s2.calculateAverage());
            System.out.println("Group average: " + group.calculateGroupAverage());
        }

}
