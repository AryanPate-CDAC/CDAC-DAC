import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Classes held: ");
        int total = sc.nextInt();

        System.out.print("Classes attended: ");
        int attended = sc.nextInt();

        System.out.print("Medical cause (Y/N): ");
        char medical = sc.next().charAt(0);

        double attendance = (attended * 100.0) / total;

        if (attendance >= 75 || medical == 'Y' || medical == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }

        sc.close();
    }
}
