class Employee {
    private String name;
    private double salary;
    private int yearsOfService;
    private static int totalEmployees = 0;

    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05;
        }
        return 0.0;
    }

    public static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee " + e1.getName() + " Bonus: " + e1.calculateBonus());
        System.out.println("Employee " + e2.getName() + " Bonus: " + e2.calculateBonus());
        System.out.println("Employee " + e3.getName() + " Bonus: " + e3.calculateBonus());

        Employee.showTotalEmployees();
    }
}
