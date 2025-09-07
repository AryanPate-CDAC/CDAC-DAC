import java.util.Scanner;
public class PrimeRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("num1: ");
		int n1 = sc.nextInt();
		System.out.print("num2: ");
		int n2 = sc.nextInt();
		for(int i=n1; i<=n2; i++){
			if(isPrime(i))
			System.out.println(i);
		}
	}
	static boolean isPrime(int n){
		int count = 0;
		if(n<2)
		return false;
		for(int i=2;i<n;i++){
			if(n%i == 0)
			return false;
		}
		return true;
	}
}	
		