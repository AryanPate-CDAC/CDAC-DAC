import java.util.Scanner;
public class Greatest3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("num1: ");
		int n1 = sc.nextInt();
		System.out.print("num2: ");
		int n2 = sc.nextInt();
		System.out.print("num3: ");
		int n3 = sc.nextInt();
		int great = (n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2 : n3;
		System.out.println("Greatest number is: " +great);
	}
}
		