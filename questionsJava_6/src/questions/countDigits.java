package questions;
//Count no of digits in an integer
import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int count=0,rem;
		
		do {
			rem = n%10;
			n=n/10;
			count++;
		}while(n>0);
		System.out.println(count);
	}
	}
	
	

