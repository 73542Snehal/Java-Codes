package functionQuestions;
//check no is prime or not
import java.util.Scanner;

public class primeNo {

	public static boolean primeNo(int n) {
		boolean isPrime = true;

		if(n==0 || n== 1) {
			isPrime =false;
		}

		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime = primeNo(n);
		System.out.println(isPrime);

	}

}
