package questions;

import java.util.Scanner;

//swap two numbers
public class swapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
	System.out.println("a and b are "+a +"\t"+b);
		
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("after swappping: "+a+" "+b);
	}
}
