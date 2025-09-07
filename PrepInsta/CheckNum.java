import java.util.*;
public class CheckNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter NUmber: ");
		int num = sc.nextInt();
		String status = (num > 0) ? " is positive"  : (num <0) ? " is negative" : "is zero";
		System.out.println(num + status);
	}
}