import java.util.Scanner;
import java.util.Arrays;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();

        Arrays.sort(nums);

        System.out.println("Ascending order: " + nums[0] + ", " + nums[1] + ", " + nums[2]);

        sc.close();
    }
}
