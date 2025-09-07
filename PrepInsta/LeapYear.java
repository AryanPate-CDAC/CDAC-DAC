import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = sc.nextInt();
		String leap = (year%400 == 0|| year%4 == 0 && year%100 != 0) ? " is a Leap Year" : " is not a Leap Year";
		System.out.print(year+leap);
	}
}