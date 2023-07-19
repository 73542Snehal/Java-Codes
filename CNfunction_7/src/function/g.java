package function;

//Function overloading
//function can have same name based on the user input it decides which function to call
//this concept is called function overloading

import java.util.Scanner;

public class g {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a) {
		return a;
	}
	
	public static double sum(double a,double b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=10;
		int b=20;
		
		int ans = sum(a,b);
		System.out.println(ans);
		
		System.out.println(sum(10,15));
		
		System.out.println(sum(20));
		
		System.out.println(sum(10.5,15.5));
	}

}
