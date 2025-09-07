import java.util.*;
public class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num: ");
		int num = sc.nextInt();
		String status = (num%2 == 0) ? "Even" : "Odd";
		System.out.println(num+ " is " +status);
	}
}
		