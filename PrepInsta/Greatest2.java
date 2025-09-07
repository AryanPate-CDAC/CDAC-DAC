import java.util.Scanner;
public class Greatest2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int n2 = sc.nextInt();
		int great = (n1>n2) ? n1 : n2;
		System.out.println("Greatest number is: " +great);
	}
}