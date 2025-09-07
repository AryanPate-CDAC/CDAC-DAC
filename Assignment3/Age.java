import java.util.Scanner;

class Employee {
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter age: ");
        int inputAge = sc.nextInt();

        emp.setAge(inputAge);

        if (inputAge >= 18) {
            System.out.println("Employee age: " + emp.getAge());
        }
    }
}
