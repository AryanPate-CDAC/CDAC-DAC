import java.util.Scanner;

public class HighestSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary for Company 1: ");
        int company1 = sc.nextInt();

        System.out.print("Enter salary for Company 2: ");
        int company2 = sc.nextInt();

        System.out.print("Enter salary for Company 3: ");
        int company3 = sc.nextInt();

        if (company1 > company2 && company1 > company3) {
            System.out.println("Company 1 offers the highest salary");
        } else if (company2 > company1 && company2 > company3) {
            System.out.println("Company 2 offers the highest salary");
        } else if (company3 > company1 && company3 > company2) {
            System.out.println("Company 3 offers the highest salary");
        } else {
            System.out.println("Two or more companies are offering the same highest salary");
        }

        sc.close();
    }
}
