package questions;
//Armstrong No

import java.util.Scanner;

public class armstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int temp,rem,arm=0;
		temp=n;
		
		while(n>0) {
			
			rem = n %10;
			n=n/10;
			
			arm = (rem*rem*rem) + arm;	
		}
		
		if(temp==arm) {
			System.out.println("Armstrong No");
		}else {
			System.out.println("Not Armstrong No");
		}
	}

}
