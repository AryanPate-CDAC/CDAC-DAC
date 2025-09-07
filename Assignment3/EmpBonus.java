// Abstract class
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

// Manager subclass
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;  // 20% bonus
    }
}

// Developer subclass
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;  // 10% bonus
    }
}

// Main class
public class EmpBonus {
    public static void main(String[] args) {
        Employee e1 = new Manager("Anita", 50000);
        Employee e2 = new Developer("Rohit", 40000);

        System.out.println(e1.name + " Bonus = " + e1.calculateBonus());
        System.out.println(e2.name + " Bonus = " + e2.calculateBonus());
    }
}
