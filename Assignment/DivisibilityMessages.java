import java.util.Scanner;

public class DivisibilityMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Divisible by 2");
        } else {
            System.out.println("Not divisible by 2");
        }

        if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 3");
        }

        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }

        sc.close();
    }
}
