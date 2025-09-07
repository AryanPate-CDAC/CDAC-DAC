import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		if (num<2){
			System.out.println(num+" is not a prime number");
		}
		int count = 0;
		for(int i=1; i<=num; i++){
			if (num%i == 0)
				count += 1;
		}
		String prime = (count > 2) ? " is not a prime number." : " is a prime number";
		System.out.println(num+prime);
	}
}
			
		