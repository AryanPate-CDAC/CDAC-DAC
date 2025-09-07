// Superclass
class Staff {
    String name;
    double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

// Teaching Staff subclass
class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    void display() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}

// Non-Teaching Staff subclass
class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println(name + " → " + department + ", " + salary);
    }
}

// Main class
public class StaffDemo {
    public static void main(String[] args) {
        TeachingStaff t = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff nt = new NonTeachingStaff("Ramesh", 40000, "Admin");

        t.display();
        nt.display();
    }
}
