package questions;
//reverse an integer
import java.util.Scanner;


public class reverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int rem,rev=0;
		
		while(n>0) {
			rem = n %10;
			n=n/10;
			rev = (rev*10)+rem;
			
		}
		System.out.print(rev);
	}

}
