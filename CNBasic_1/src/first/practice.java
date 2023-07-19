package first;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		boolean isPrime = true;

		if(n==0||n==1) {
			isPrime = false;
		}

		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime = false;
				System.out.print(i+" ");
			}     	
		}
		if(isPrime) {  	
			System.out.println("-1");            
		}	
	}
}








	

