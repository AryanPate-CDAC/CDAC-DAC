abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;
    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }
    double calculateSalary() {
        return basicSalary + hra;
    }
    public double calculateBonus() {
        return calculateSalary() * 0.1;
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmpSystem {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee p2 = new PermanentEmployee("Rohit", 102, 40000, 4000);
        ContractEmployee c1 = new ContractEmployee("Neha", 201, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Kiran", 202, 250, 120);

        System.out.println(p1.name + " Salary = " + p1.calculateSalary() + ", Bonus = " + p1.calculateBonus());
        System.out.println(p2.name + " Salary = " + p2.calculateSalary() + ", Bonus = " + p2.calculateBonus());
        System.out.println(c1.name + " Salary = " + c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + c2.calculateSalary());
    }
}
