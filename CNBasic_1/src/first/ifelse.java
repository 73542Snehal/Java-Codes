package first;

import java.util.Scanner;

public class ifelse {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int a,b;
	System.out.println("enter a b");
	a = sc.nextInt();
	b = sc.nextInt();
	
	if(a>b) {
		System.out.println("a greater");
	}else {
		System.out.println("b greater");
	}
	}
}
