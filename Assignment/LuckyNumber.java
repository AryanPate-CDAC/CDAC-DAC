import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int A = num / 1000;           
        int B = (num / 100) % 10;     
        int C = (num / 10) % 10;      
        int D = num % 10;             

        if ((A + B) == (C + D)) {
            System.out.println("Lucky number");
        } else {
            System.out.println("Not a lucky number");
        }

        sc.close();
    }
}
