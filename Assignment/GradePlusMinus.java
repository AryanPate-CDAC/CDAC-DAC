import java.util.Scanner;

public class GradePlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 85) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: A−");
        } else if (marks >= 65) {
            System.out.println("Grade: B+");
        } else if (marks >= 55) {
            System.out.println("Grade: B");
        } else if (marks >= 45) {
            System.out.println("Grade: C");
        } else if (marks >= 35) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
