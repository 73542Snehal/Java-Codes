package questions;

import java.util.Scanner;

//even or odd
public class evenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter n");
		n=sc.nextInt();
		
		if(n==0) {
			System.out.println("Please enter n grater than 0");
			return;
		}
		
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}

	}

}
