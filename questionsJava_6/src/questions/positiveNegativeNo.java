package questions;

import java.util.Scanner;

//positive and -ve no
public class positiveNegativeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter n");
		n=sc.nextInt();
		
		if(n==0) {
			System.out.println("Please enter n grater than 0");
			return;
		}
		
		if(n>0) {
			System.out.println("positive No");
		}else {
			System.out.println("Negative No");
		}

	}

}
