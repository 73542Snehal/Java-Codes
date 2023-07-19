package questions;
//palindrome or not
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n;
		n = sc.nextInt();
		int temp,rem,rev=0;
		temp =n;

		while(n>0) {
			rem = n %10;
			n=n/10;
			rev = (rev*10)+rem;

		}

		if(rev == temp) {
			System.out.println("Palindrome");

		}else {
			System.out.println("Not Palindrome");
		}
	}
}
