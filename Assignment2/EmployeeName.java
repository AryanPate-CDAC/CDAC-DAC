class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private static int counter = 1001;

    public Employee() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    public Employee(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

public class EmployeeName {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Anjali", 35000);

        System.out.println("Employee1: ID=" + e1.getId() + ", Name=" + e1.getName() + ", Salary=" + e1.getBasicSalary());
        System.out.println("Employee2: ID=" + e2.getId() + ", Name=" + e2.getName() + ", Salary=" + e2.getBasicSalary());
    }
}
