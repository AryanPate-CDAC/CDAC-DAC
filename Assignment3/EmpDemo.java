// Superclass
class Employee {
    protected String name;
    protected double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        return basicSalary;
    }
}

// RegularEmployee subclass
class RegularEmployee extends Employee {
    RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateNetSalary() {
        return basicSalary + (0.10 * basicSalary);  // HRA 10%
    }
}

// ContractEmployee subclass
class ContractEmployee extends Employee {
    ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateNetSalary() {
        return basicSalary + (0.05 * basicSalary);  // Allowance 5%
    }
}

// Main class
public class EmpDemo {
    public static void main(String[] args) {
        RegularEmployee e1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee e2 = new ContractEmployee("Riya", 15000);

        System.out.println(e1.name + " Net Salary = " + e1.calculateNetSalary());
        System.out.println(e2.name + " Net Salary = " + e2.calculateNetSalary());
    }
}
