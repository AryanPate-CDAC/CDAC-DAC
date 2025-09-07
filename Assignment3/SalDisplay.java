// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Salary = " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (0.20 * salary); // 20% bonus
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

// Subclass Developer
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (0.10 * salary); // 10% bonus
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

// Main class
public class SalDisplay {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);

        m.displaySalary();
        d.displaySalary();
    }
}
