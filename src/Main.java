public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);

        Technology javaTech = new Technology("Java", 800);
        dev.addTechnology(javaTech);
        employees.add(dev);

        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        employees.add(tester);
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal fbGoal = new Goal("Implementing FB login", LocalDate.of(2010, 10, 15), 1000);
        manager.addGoal(fbGoal);
        employees.add(manager);

        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " PLN");
    }
}
class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel;
    protected int employmentYear;
    public Employee(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.employmentYear = employmentYear;
    }
    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsOfWork = LocalDate.now().getYear() - employmentYear;
        return baseSalary + (yearsOfWork * 1000);
    }
}
class Developer extends Employee {
    private ArrayList<Technology> technologies = new ArrayList<>();
    public Developer(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
    }
    public void addTechnology(Technology tech) {
        technologies.add(tech);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology tech : technologies) {
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }
}
class Tester extends Employee {
    private ArrayList<String> testTypes = new ArrayList<>();
    public Tester(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
    }
    public void addTestType(String testType) {
        testTypes.add(testType);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        return baseSalary + (testTypes.size() * 300);
    }
}
class Manager extends Employee {
    private ArrayList<Goal> goals = new ArrayList<>();
    public Manager(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
    }
    public void addGoal(Goal goal) {
        goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                bonus += goal.getBonus();
            }
        }
        return baseSalary + bonus;
    }
}
class Technology {
    private String name;
    private int bonus;
    public Technology(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
}
class Goal {
    private String name;
    private LocalDate date;
    private int bonus;
    public Goal(String name, LocalDate date, int bonus) {
        this.name = name;
        this.date = date;
        this.bonus = bonus;
    }
    public boolean isAchieved() {
        return LocalDate.now().isAfter(date);
    }
    public int getBonus() {
        return bonus;
    }
}


