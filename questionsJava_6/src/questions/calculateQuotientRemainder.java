package questions;

import java.util.Scanner;

//calculate quotient and reminder
public class calculateQuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend,divisor;
		System.out.println("Enter dividend and divisor");
		dividend=sc.nextInt();
		divisor=sc.nextInt();
		

		int q=dividend/divisor;
		int r=dividend%divisor;
		
		System.out.println("q is = "+q+" r is ="+r);

	}    

}
