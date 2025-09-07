import java.util.*;
public class Amstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int n = sc.nextInt();
		int digits = 0, sum = 0;
		int temp = n;
		while(temp !=0){
			digits++;
			temp = temp/10;
		}
		temp = n;
		while(temp!=0){
			int rem = temp%10;
			sum += (int)Math.pow(rem, digits);  // Cast to int
			temp = temp/10;
		}
		String status = (n == sum) ? " is an Amstrong number." : " is not an Amstrong number.";
		System.out.println(n+status);
	}
}