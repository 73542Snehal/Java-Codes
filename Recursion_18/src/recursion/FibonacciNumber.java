package recursion;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static int fib(int n) {
		
		if(n==1 || n==2) {
			return 1;
		}
		
		int fib1 = fib(n-1);
		int fib2 = fib(n-2);
		int ans = fib1+fib2;
		return ans;
	}

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fib(n);
		System.out.println(ans);
		

	}
}
