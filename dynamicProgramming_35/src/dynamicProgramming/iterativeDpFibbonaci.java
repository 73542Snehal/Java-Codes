package dynamicProgramming;

import java.util.Scanner;

public class iterativeDpFibbonaci {
//time and space complexity O(n)
	//this does not occupy stack space
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		int ans = fib(n);
	
		System.out.println(ans);
	}
}
